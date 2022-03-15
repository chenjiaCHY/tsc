package com.ntschy.tsc.service;

import com.ntschy.tsc.entity.base.Result;

public interface InvestmentService {

    Result nantongGdp() throws RuntimeException;

    Result regionalGdp() throws RuntimeException;

    Result gdpProportion() throws RuntimeException;

    Result nantongImport() throws RuntimeException;

    Result nantongPopulation() throws RuntimeException;

    Result newConstruction() throws RuntimeException;

    Result realEstateArea() throws RuntimeException;
}
