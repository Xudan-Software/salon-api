package com.xuandjordan.salonapi.salonservice;

import com.xuandjordan.salonapi.salonservice.SalonService;
import com.xuandjordan.salonapi.salonservice.SalonServiceDetail;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/services")
@CrossOrigin(origins = "*")
public class SalonServiceController {
    private final SalonService salonService;

    public SalonServiceController(SalonService salonService){
        this.salonService= salonService;
    }


    @GetMapping("/retrieveAvailableSalonServices")
    @ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
    public List<SalonServiceDetail> retrieveAvailableSalonServicesAPI() {
        return salonService.findAll();
    }

}
