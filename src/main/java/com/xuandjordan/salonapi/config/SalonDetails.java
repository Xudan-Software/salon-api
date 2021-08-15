package com.xuandjordan.salonapi.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public SalonDetails clone(){
        SalonDetails salonDetails = new SalonDetails();
        salonDetails.address=address;
        salonDetails.city=city;
        salonDetails.state=state;
        salonDetails.zipcode=zipcode;
        salonDetails.phone=phone;
        salonDetails.name=name;
        return salonDetails;
    }
}
