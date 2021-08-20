package com.xuandjordan.salonapi.salonservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class SalonServiceDetailRepo implements SalonServiceDetailRepository {
    private JdbcTemplate jdbc;
    private final String SQL_GET_ALL = "select * from salon_service_detail";

    @Autowired
    public SalonServiceDetailRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override public List<SalonServiceDetail> findAll() {
        return jdbc.query(SQL_GET_ALL,
            this::mapRowToAvailableService);

    }
    private SalonServiceDetail mapRowToAvailableService(
        ResultSet rs,
        int rowNum)
        throws SQLException {
        return new SalonServiceDetail(rs.getLong("id"),
            rs.getString("name"),
            rs.getString("description"),
            rs.getLong("price"),
            rs.getInt("time_in_minutes"));
    }

    @Override public List<SalonServiceDetail> findAll(Sort sort) {
        return null;
    }


    @Override public Page<SalonServiceDetail> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public List<SalonServiceDetail> findAllById(Iterable<Long> longs) {
        return null;
    }


    @Override public long count() {
        return 0;
    }


    @Override public void deleteById(Long aLong) {

    }


    @Override public void delete(SalonServiceDetail entity) {

    }


    @Override public void deleteAllById(Iterable<? extends Long> longs) {

    }


    @Override
    public void deleteAll(Iterable<? extends SalonServiceDetail> entities) {

    }


    @Override public void deleteAll() {

    }


    @Override public <S extends SalonServiceDetail> S save(S entity) {
        return null;
    }


    @Override
    public <S extends SalonServiceDetail> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    @Override public Optional<SalonServiceDetail> findById(Long aLong) {
        return Optional.empty();
    }


    @Override public boolean existsById(Long aLong) {
        return false;
    }


    @Override public void flush() {

    }


    @Override public <S extends SalonServiceDetail> S saveAndFlush(S entity) {
        return null;
    }


    @Override
    public <S extends SalonServiceDetail> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }


    @Override
    public void deleteAllInBatch(Iterable<SalonServiceDetail> entities) {

    }


    @Override public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }


    @Override public void deleteAllInBatch() {

    }


    @Override public SalonServiceDetail getOne(Long aLong) {
        return null;
    }


    @Override public SalonServiceDetail getById(Long aLong) {
        return null;
    }


    @Override
    public <S extends SalonServiceDetail> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }


    @Override
    public <S extends SalonServiceDetail> List<S> findAll(Example<S> example) {
        return null;
    }


    @Override public <S extends SalonServiceDetail> List<S> findAll(
        Example<S> example, Sort sort) {
        return null;
    }


    @Override public <S extends SalonServiceDetail> Page<S> findAll(
        Example<S> example, Pageable pageable) {
        return null;
    }


    @Override
    public <S extends SalonServiceDetail> long count(Example<S> example) {
        return 0;
    }


    @Override
    public <S extends SalonServiceDetail> boolean exists(Example<S> example) {
        return false;
    }



}
