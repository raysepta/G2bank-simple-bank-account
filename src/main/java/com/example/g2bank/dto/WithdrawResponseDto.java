package com.example.g2bank.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WithdrawResponseDto {
    private Integer balance;
}
