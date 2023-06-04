package com.erp.school.controllers;

import lombok.extern.slf4j.Slf4j;
import com.erp.school.dtos.SMSSendRequest;
import com.erp.school.services.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class SMSController {

    @Autowired
    SMSService smsService;


    @PostMapping("/processSMS")
    public  String  processSMS(@RequestBody SMSSendRequest sendRequest){
        log.info("sms process is" + sendRequest.toString());
        return smsService.sendSms(sendRequest.getDestinationNumber(),sendRequest.getSmsMessage());


    }


}