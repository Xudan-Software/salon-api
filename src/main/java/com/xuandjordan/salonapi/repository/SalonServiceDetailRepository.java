package com.xuandjordan.salonapi.repository;

import com.xuandjordan.salonapi.SalonDetails;
import com.xuandjordan.salonapi.entity.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface SalonServiceDetailRepository extends
    CrudRepository<SalonServiceDetail, Long> {
    //todo:query method to be implemented
}
