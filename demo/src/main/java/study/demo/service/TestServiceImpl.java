package study.demo.service;

import com.example.study.dao.TestDao;
import com.example.study.dto.StudyBoardDto;
import com.example.study.dto.StudyUserDto;
import com.example.study.entity.StudyUser;
import com.example.study.repository.StudyUserReopsitory;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private StudyUserReopsitory studyUserReopsitory;

    public String getMember(){
        return testDao.getMember();
    }

    // 트랜잭션 이란? 간단하게 이야기해서 로직이 정상적으로 종료되었을 때 작업을 수행한다. 비정상적으로 종료되면 롤백한다.
    // 대부분 sql작업에 주로 트랜잭션을 걸지만, 해당부분은 단지 DTO에 값을 넣어주는 과정밖에 없다. 왜 트랜잭션을 사용했을까?
    // JPA에서 로딩된 엔티티 컬렉션을 초기화하기 위해 사용한다.
    // 트랜잭션을 시작하고 시작동안 DB 세션을 유지하게 도와준다. Lazy(지연로딩) 연관관계를 조회할 때 트랜잭션이 필요하다.
    // * Lazy 지연로딩 : 엔티티 객체에서 하나의 엔티티를 가져올 때 모든 엔티티를 가져오면 굉장한 손해를 유발한다. 그렇기에 지연로딩을 사용하여 필요한 객체 먼저 가지고 오는 것이다.
    // * EAGER 즉시로딩 : 하나의 엔티티를 조회할 떄 모든 객체를 가져오는 방법
    // 단 조인컬럼의 패치 값이 EAGER 즉시로딩일 때는 트렌잭션을 사용하지 않아도 된다.
    @Transactional
    public List<StudyUserDto> getJpaMember(){
        List<StudyUser> studyUsers = studyUserReopsitory.findAll();
        List<StudyUserDto> studyUserDtos = new ArrayList<>();


        // 유저 리스트 엔티티에서 값을 추출하여 dto에 넣어주는 과정
        studyUsers.forEach((studyUser) -> {
            StudyUserDto dto = new StudyUserDto();
            dto.setSuUserId(studyUser.getSuUserId());
            dto.setSuName(studyUser.getSuName());

            // 유저 리스트 > boards 엔티티에서 값을 추출하여 board dto에 넣어주는 과정
            List<StudyBoardDto> studyBoardDtos = new ArrayList<>();
            studyUser.getStudyBoards().forEach((studyBoard) -> {
                StudyBoardDto boardDto = new StudyBoardDto();
                boardDto.setSbId(studyBoard.getSbId());
                boardDto.setSbTitle(studyBoard.getSbTitle());
                boardDto.setSbContent(studyBoard.getSbContent());
                studyBoardDtos.add(boardDto);
            });

            dto.setStudyBoardList(studyBoardDtos);
            studyUserDtos.add(dto);
        });
        return studyUserDtos;
    }

//    public List<StudyUser> getJpaMember(){
//        List<StudyUser> studyUser = studyUserReopsitory.findAll();
//        return studyUser;
//    }
}
