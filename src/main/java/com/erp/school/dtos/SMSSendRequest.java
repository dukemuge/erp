package com.erp.school.dtos;

import lombok.Data;

@Data
public class SMSSendRequest {
    private String destinationNumber;
    private  String smsMessage;
}