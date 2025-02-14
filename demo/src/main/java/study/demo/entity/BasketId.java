package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@RequiredArgsConstructor
public class BasketId implements Serializable {

    @Column(name = "BASKET_NO")
    private Integer basketNo;

    @Column(name = "USER_ID")
    private String userId;
}