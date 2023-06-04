package com.erp.school.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Getter
@Setter
public class StkPush_Entries {

    @Id
    private String internalId;

//    @Indexed(unique = true)
    private String transactionId;

    private String transactionType;

    private String msisdn;

    private Long amount;

//    @Indexed(unique = true)
    private String merchantRequestID;

//    @Indexed(unique = true)
    private String checkoutRequestID;

    private Date entryDate;

    private String resultCode;

    private String rawCallbackPayloadResponse;

}