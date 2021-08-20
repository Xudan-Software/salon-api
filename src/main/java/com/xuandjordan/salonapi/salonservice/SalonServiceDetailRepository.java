package com.xuandjordan.salonapi.salonservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalonServiceDetailRepository extends
    JpaRepository<SalonServiceDetail, Long> {
    List<SalonServiceDetail> findAll();

}
