package com.erp.school.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "b2c_c2_entries")
@Getter
@Setter
public class B2C_C2B_Entries {

    @Id
    private Long Id;

    private String transactionType;

//    @Indexed(unique = true)
    private String transactionId;

    private String billRefNumber;

    private String msisdn;

    private String amount;

//    @Indexed(unique = true)
    private String conversationId;

//    @Indexed(unique = true)
    private String originatorConversationId;

    private Date EntryDate;

    private String resultCode;

    private Object rawCallbackPayloadResponse;
}