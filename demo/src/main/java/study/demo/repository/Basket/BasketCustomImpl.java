package study.demo.repository.Basket;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import study.demo.dto.BasketDto;
import study.demo.dto.QBasketDto;

import java.util.List;

import static study.demo.entity.QBasket.basket;
import static study.demo.entity.QUser.user;

@RequiredArgsConstructor
public class BasketCustomImpl implements BasketCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public List<BasketDto> getBasketUserInfo(String userId){

//        List<Integer> test = jpaQueryFactory
//                .select(
//                        basket.id.basketNo
//                )
//                .from(basket)
//                .where(basket.id.userId.eq(userId))
//                .fetch();
//
//        List<Basket> test2 = jpaQueryFactory
//                .select(
//                        basket
//                )
//                .from(basket)
//                .where(basket.id.userId.eq(userId))
//                .fetch();
//
//        List<BasketDto> test3 = jpaQueryFactory
//                .select(
//                        new QBasketDto(
//                                basket.id.basketNo,
//                                basket.id.userId
//                        )
//
//                )
//                .from(basket)
//                .where(basket.id.userId.eq(userId))
//                .fetch();

        return jpaQueryFactory
                .select(
                        new QBasketDto(
                                basket.id.basketNo,
                                basket.id.userId,
                                basket.basketMovieTitle,
                                basket.basketUserAge,
                                basket.basketMovieNum
                        )
                )
                .from(basket)
                .where(basket.id.userId.eq(userId))
                .fetch();
    }

    public List<BasketDto> getBasketInfoIncludeUserName(String userId) {

        return jpaQueryFactory
                .select(
                        new QBasketDto(
                              basket.id.basketNo,
                              basket.id.userId,
                              basket.basketMovieTitle,
                              basket.basketUserAge,
                              basket.basketMovieNum,
                                user.userName
                        )
                )
                .from(basket)
                .leftJoin(user).on(user.userId.eq(basket.id.userId))
                .where(basket.id.userId.eq(userId))
                .fetch();
    }

}
