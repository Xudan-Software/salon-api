package com.xuandjordan.salonapi.repository;

import com.xuandjordan.salonapi.entity.SalonServiceDetail;
import com.xuandjordan.salonapi.entity.Slot;
import org.springframework.data.repository.CrudRepository;

public interface SlotRepository extends
    CrudRepository<Slot, Long> {
    //todo:query method to be implemented
}
