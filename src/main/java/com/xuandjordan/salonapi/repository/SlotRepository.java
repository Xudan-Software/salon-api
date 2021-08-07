package com.xuandjordan.salonapi.repository;

import com.xuandjordan.salonapi.entity.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface SlotRepository extends
    CrudRepository<SalonServiceDetail, Long> {
    //todo:query method to be implemented
}
