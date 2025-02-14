package study.demo.repository.Basket;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.dto.BasketDto;
import study.demo.entity.Basket;
import study.demo.entity.BasketId;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, BasketId>, BasketCustom {

}
