package com.ntschy.tsc.entity.DO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegionalGdp {

    private String area;

    private String year;

    private String season;

    private BigDecimal primaryIndustry;

    private BigDecimal secondaryIndustry;

    private BigDecimal tertiaryIndustry;
}
