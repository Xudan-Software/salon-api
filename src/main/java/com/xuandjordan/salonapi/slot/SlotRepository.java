package com.xuandjordan.salonapi.slot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends
    JpaRepository<Slot, Long> {
    //todo:query method to be implemented
}
