package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.BasketDto;

import study.demo.entity.Basket;
import study.demo.entity.BasketId;
import study.demo.repository.Basket.BasketRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService{

    private final BasketRepository basketRepository;

    @Override
    public List<BasketDto> getBasketDetail(String userId) {

        return basketRepository.getBasketUserInfo(userId);
    }

    @Override
    public List<BasketDto> getBasketInfoIncludeUserName(String userId) {

        return basketRepository.getBasketInfoIncludeUserName(userId);
    }

    @Override
    public List<BasketDto> addBasketUser(BasketDto basketDto) {

//        return basketRepository.save(Basket);
        return null;
    }
}
