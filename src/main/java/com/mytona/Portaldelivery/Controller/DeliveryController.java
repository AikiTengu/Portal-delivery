package com.mytona.Portaldelivery.Controller;

import com.mytona.Portaldelivery.Model.DAO.DeliveryDAO;
import com.mytona.Portaldelivery.Model.Entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryDAO deliveryDAO;

    @GetMapping("/{deliveryId}")
    public Delivery get(@PathVariable("deliveryId") long deliveryId) {
        return deliveryDAO.findDelivery(deliveryId);
    }

    @GetMapping("/all")
    public List<Delivery> getAll(){
        return deliveryDAO.findAll();
    }

    @PostMapping
    public Delivery save(@RequestBody Delivery customer){
        return deliveryDAO.save(customer);
    }

    @DeleteMapping("/{deliveryId}")
    public String remove(@PathVariable("deliveryId") long deliveryId){
        return deliveryDAO.deleteDelivery(deliveryId);
    }
}