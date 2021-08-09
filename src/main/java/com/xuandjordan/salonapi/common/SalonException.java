package com.xuandjordan.salonapi;
//todo:complete exception handler class
public class SalonException extends RuntimeException{
    public SalonException(String detail) {
        super(detail);
    }
}
