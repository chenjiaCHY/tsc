package com.ntschy.tsc.service.impl;

import com.ntschy.tsc.dao.InvestmentDao;
import com.ntschy.tsc.entity.DO.*;
import com.ntschy.tsc.entity.base.Result;
import com.ntschy.tsc.entity.dto.PopulationResult;
import com.ntschy.tsc.entity.dto.RealEstateAreaResponse;
import com.ntschy.tsc.service.InvestmentService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Resource
    private InvestmentDao investmentDao;

    @Override
    public Result nantongGdp() throws RuntimeException {

        // 获取最近两年南通市宏观经济发展情况
        List<RegionalGdp> nantongGdp = investmentDao.getNantongGdp();

        if (CollectionUtils.isEmpty(nantongGdp)) {
            return new Result(true, Collections.emptyList());
        }

        return new Result(true, nantongGdp);
    }

    @Override
    public Result regionalGdp() throws RuntimeException {
        // 获取南通市各区县最后一次的GDP数据
        // 先查询数据库中最后一年
        String lastYear = investmentDao.getLastYear();

        // 再查询该年最近的季度
        String lastSeason = "";
        Integer seasonCount = investmentDao.getSeasonCount(lastYear);
        if (seasonCount == 4) {
            lastSeason = "第1-4季度";
        } else if (seasonCount == 3) {
            lastSeason = "第1-3季度";
        } else if (seasonCount == 2) {
            lastSeason = "第1-2季度";
        } else {
            lastSeason = "第1季度";
        }

        // 然后查询最近一年最近一个季度的数据
        List<RegionalGdp> regionalGdpList = investmentDao.getRegionalGdp(lastYear, lastSeason);

        if (CollectionUtils.isEmpty(regionalGdpList)) {
            return new Result(true, Collections.emptyList());
        }

        return new Result(true, regionalGdpList);
    }

    @Override
    public Result gdpProportion() throws RuntimeException {

        List<RegionalComposition> regionalCompositionList = investmentDao.getRegionalComposition();

        if (CollectionUtils.isEmpty(regionalCompositionList)) {
            return new Result(true, Collections.emptyList());
        }

        return new Result(true, regionalCompositionList);
    }

    @Override
    public Result nantongImport() throws RuntimeException {

        List<ImportValue> importValueList = investmentDao.getImportValue();

        if (CollectionUtils.isEmpty(importValueList)) {
            return new Result(true, Collections.emptyList());
        }

        return new Result(true, importValueList);
    }

    @Override
    public Result nantongPopulation() throws RuntimeException {

        PopulationResult populationResult = new PopulationResult();

        List<Population> nantongPopulation = investmentDao.getNantongPopulation();

        List<Population> registerPopulation = investmentDao.getRegisterPopulation();

        List<Population> urbanPopulation = investmentDao.getUrbanPopulation();

        populationResult.setNantongPopulation(nantongPopulation);

        populationResult.setRegisterPopulation(registerPopulation);

        populationResult.setUrbanPopulation(urbanPopulation);

        return new Result(true, populationResult);
    }

    @Override
    public Result newConstruction() throws RuntimeException {

        List<RealEstate> newConstructionList = investmentDao.getNewConstructionList();

        if (CollectionUtils.isEmpty(newConstructionList)) {
            return new Result(true, Collections.emptyList());
        }

        return new Result(true, newConstructionList);
    }

    @Override
    public Result realEstateArea() throws RuntimeException {

        RealEstateAreaResponse realEstateAreaResponse = new RealEstateAreaResponse();

        List<RealEstate> constructionList = investmentDao.getConstructionList();

        List<RealEstate> completeList = investmentDao.getCompleteList();

        List<RealEstate> saleList = investmentDao.getSaleList();

        realEstateAreaResponse.setConstructionList(constructionList);

        realEstateAreaResponse.setCompleteList(completeList);

        realEstateAreaResponse.setSaleList(saleList);

        return new Result(true, realEstateAreaResponse);
    }
}
