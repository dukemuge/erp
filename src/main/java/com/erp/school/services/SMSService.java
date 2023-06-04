package com.erp.school.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SMSService {
    @Value("${TWILIO_ACCOUNT_SID")
    String ACCOUNT_SID;

    @Value("${TWILIO_AUTH_TOKEN")
    String AUTH_TOKEN;

    @Value("${TWILIO_OUTGOING_SMS_NUMBER")
    String SMS_NUMBER;

    @PostConstruct
    private void setup(){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
    }


    public String sendSms(String smsNumber,String smsMessage){
        MessageCreator creator = 	Message.creator(
                new PhoneNumber(smsNumber),
                new PhoneNumber(SMS_NUMBER),
                smsMessage);
        creator.create(); //sends the message
        return "";
    }
}