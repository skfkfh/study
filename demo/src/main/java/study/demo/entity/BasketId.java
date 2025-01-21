package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Embeddable
@Data
@RequiredArgsConstructor
public class BasketId {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BASKET_NO")
    private Integer basketNo;

    @Column(name = "USER_ID")
    private String userId;
}