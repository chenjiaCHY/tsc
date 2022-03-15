package com.ntschy.tsc.entity.DO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Population {

    private String area;

    private String year;

    private BigDecimal population;
}
