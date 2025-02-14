package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.BasketDto;
import study.demo.entity.BasketId;
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
    public ResponseEntity<String> createBasket(@RequestBody BasketDto basketDto) {
        basketService.addBasketMovie(basketDto);

        return ResponseEntity.ok("Movie added to basket succesfully!");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteBasketByBasketNo(@RequestParam String basketNo) {
        basketService.deleteBasketByBasketNo(basketNo);

        return ResponseEntity.ok("Movie deleted from basket succesfully!");
    }
}
