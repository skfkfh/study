package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.BasketDto;
import study.demo.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/detail")
    public List<BasketDto> getBasketDetail(@RequestParam String userId) {
        return basketService.getBasketDetail(userId);
    }

    @GetMapping("/detailName")
    public List<BasketDto> getBasketInfoIncludeUserName(@RequestParam String userId) {
        return basketService.getBasketInfoIncludeUserName(userId);
    }

    @PostMapping
    public List<BasketDto> createBasket(@RequestBody BasketDto basketDto) {
        return basketService.addBasketUser(basketDto);
    }
}
