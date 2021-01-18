package com.mytona.Portaldelivery.Model.DAO;

import com.mytona.Portaldelivery.Model.Entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeliveryDAO {

    public static  final String HASH_KEY = "Delivery";

    @Autowired
    private RedisTemplate redisTemplate;


    public Delivery save(Delivery delivery){
        redisTemplate.opsForHash().put(HASH_KEY, delivery.getDeliveryId(),delivery);
        return delivery;
    }

    public List<Delivery> findAll(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Delivery findDelivery(long deliveryId){
        return (Delivery) redisTemplate.opsForHash().get(HASH_KEY,deliveryId);
    }

    public String deleteDelivery(long deliveryId){
        redisTemplate.opsForHash().delete(HASH_KEY, deliveryId);
        return "Deleted delivery";
    }
}