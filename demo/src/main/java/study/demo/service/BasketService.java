package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.entity.Basket;

@Service
public interface BasketService {

    Basket getBasketDetail(String userId);
}
