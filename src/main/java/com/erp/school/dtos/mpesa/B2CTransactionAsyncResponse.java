package com.erp.school.dtos.mpesa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class B2CTransactionAsyncResponse{

	@JsonProperty("Result")
	private Result result;
}