package com.codewithsuraj.CloudGateway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/orderServiceFallback")
    public String orderServiceFallback(){
        return "Order Service is down. Please try again later.";
    }

    @GetMapping("/paymentServiceFallback")
    public String paymentServiceFallback(){
        return "Payment Service is down. Please try again later.";
    }

    @GetMapping("/productServiceFallback")
    public String productServiceFallback(){
        return "Product Service is down. Please try again later.";
    }
}
