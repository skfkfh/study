package study.demo.repository.Basket;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.Basket;
import study.demo.entity.BasketId;

public interface BasketRepository extends JpaRepository<Basket, BasketId>, BasketCustom {
}
