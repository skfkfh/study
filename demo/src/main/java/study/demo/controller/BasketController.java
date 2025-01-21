package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.BasketDto;
import study.demo.entity.Basket;
import study.demo.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/detail")
    public Basket getBasketDetail(@RequestParam String userId) {
        return basketService.getBasketDetail(userId);
    }

    @GetMapping("/detailName")
    public List<BasketDto> getBasketInfoIncludeUserName(@RequestParam String userId) {
        return basketService.getBasketInfoIncludeUserName(userId);
    }
}
