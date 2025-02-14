package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.BasketDto;
import study.demo.entity.Basket;
import study.demo.entity.BasketId;

import java.util.List;

@Service
public interface BasketService {

    List<BasketDto> getBasketDetail(String userId);


    List<BasketDto> getBasketInfoIncludeUserName(String userId);

    List<BasketDto> addBasketUser(BasketDto basketDto);
}
