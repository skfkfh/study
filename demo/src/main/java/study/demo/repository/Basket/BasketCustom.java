package study.demo.repository.Basket;

import study.demo.dto.BasketDto;

import java.util.List;

public interface BasketCustom {
    List<BasketDto> getBasketUserInfo(String userId);

    List<BasketDto> getBasketInfoIncludeUserName(String userId);
}
