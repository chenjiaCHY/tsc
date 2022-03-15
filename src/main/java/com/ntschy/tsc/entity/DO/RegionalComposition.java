package com.ntschy.tsc.entity.DO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegionalComposition {

    private String area;

    private String year;

    private BigDecimal primaryIndustryProportion;

    private BigDecimal secondaryIndustryProportion;

    private BigDecimal tertiaryIndustryProportion;
}
