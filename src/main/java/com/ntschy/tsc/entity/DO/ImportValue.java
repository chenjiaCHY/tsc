package com.ntschy.tsc.entity.DO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ImportValue {

    private String area;

    private String year;

    private String month;

    private BigDecimal currentMonth;
}
