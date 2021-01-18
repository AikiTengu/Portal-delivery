package com.mytona.Portaldelivery.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Delivery")
public class Delivery implements Serializable {

    @Id
    private long deliveryId;
    private String deliveryType;
    private LocalDate date;
    private String address;
    private boolean delivered;

}