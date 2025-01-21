package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.BasketDto;
import study.demo.entity.Basket;

import java.util.List;

@Service
public interface BasketService {

    Basket getBasketDetail(String userId);

    List<BasketDto> getBasketInfoIncludeUserName(String userId);
}
