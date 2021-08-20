package com.xuandjordan.salonapi.web;

import com.xuandjordan.salonapi.salonservice.SalonServiceDetail;
import com.xuandjordan.salonapi.salonservice.SalonServiceDetailRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/services",
    produces = "application/json")
@CrossOrigin(origins = "*")
public class SalonServiceController {
    private SalonServiceDetailRepo salonServiceDetailRepo;
    public  SalonServiceController(final SalonServiceDetailRepo salonServiceDetailRepo){
        this.salonServiceDetailRepo = salonServiceDetailRepo;
    }
    @GetMapping("/retrieveAvailableSalonServices")
    public List<SalonServiceDetail> findAllAvailableSalonServices() {
        return salonServiceDetailRepo.findAll();
    }

}
