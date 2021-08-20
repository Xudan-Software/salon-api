package com.xuandjordan.salonapi.salonservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class SalonService {
    SalonServiceDetailRepository salonServiceDetailRepository;

    public SalonService(SalonServiceDetailRepository salonServiceDetailRepository) {
        this.salonServiceDetailRepository = salonServiceDetailRepository;
    }

    public List<SalonServiceDetail> findAll() {
        return salonServiceDetailRepository.findAll();
    }
}
