package com.xuandjordan.salonapi.salonservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalonServiceDetailRepository extends
    JpaRepository<SalonServiceDetail, Long> {
    //todo: return list or Iterable?
    List<SalonServiceDetail> findAll();

}
