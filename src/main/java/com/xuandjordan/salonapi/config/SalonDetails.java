package com.xuandjordan.salonapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalonDetails {
    @Value("${name}")
    private String name;
    @Value("${address}")
    private String address;
    @Value("${city}")
    private String city;
    @Value("${state}")
    private String state;
    @Value("${zipcode}")
    private String zipcode;
    @Value("${phone}")
    private String phone;

}
