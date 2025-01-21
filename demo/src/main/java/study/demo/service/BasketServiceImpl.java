package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.BasketDto;
import study.demo.entity.Basket;
import study.demo.repository.Basket.BasketRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService{

    private final BasketRepository basketRepository;

    public Basket getBasketDetail(String userId) {
//
//        Optional<Basket> basket = basketRepository.findById(userId);
//        return basket.orElse(null);

        return null;
    }

    @Override
    public List<BasketDto> getBasketInfoIncludeUserName(String userId) {

        return basketRepository.getBasketInfoIncludeUserName(userId);
    }
}
