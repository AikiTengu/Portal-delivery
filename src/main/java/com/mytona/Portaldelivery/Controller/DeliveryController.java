package com.mytona.Portaldelivery.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

//TODO: CRU deliveries

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @GetMapping("/{deliveryId}")
    public String getDelivery(@PathVariable("deliveryId") String deliveryId) {
        return "Successfully retrieved delivery:" + " " + deliveryId;
    }
}
