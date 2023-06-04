package com.erp.school.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDto {
    private String to;
    private String subject;
    private  String text;
}
