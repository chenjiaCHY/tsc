package com.ntschy.tsc.dao;

import com.ntschy.tsc.entity.DO.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InvestmentDao {

    List<RegionalGdp> getNantongGdp() throws RuntimeException;

    String getLastYear() throws RuntimeException;

    Integer getSeasonCount(@Param("year") String year) throws RuntimeException;

    List<RegionalGdp> getRegionalGdp(@Param("year") String year,
                                     @Param("season") String season) throws RuntimeException;

    List<RegionalComposition> getRegionalComposition() throws RuntimeException;

    List<ImportValue> getImportValue() throws RuntimeException;

    List<Population> getNantongPopulation() throws RuntimeException;

    List<Population> getUrbanPopulation() throws RuntimeException;

    List<Population> getRegisterPopulation() throws RuntimeException;

    List<RealEstate> getNewConstructionList() throws RuntimeException;

    List<RealEstate> getConstructionList() throws RuntimeException;

    List<RealEstate> getCompleteList() throws RuntimeException;

    List<RealEstate> getSaleList() throws RuntimeException;
}
