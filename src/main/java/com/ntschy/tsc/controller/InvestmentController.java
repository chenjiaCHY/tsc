package com.ntschy.tsc.controller;

import com.ntschy.tsc.entity.base.Result;
import com.ntschy.tsc.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/investment")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    /**
     * 获取南通市宏观经济发展情况
     * @return
     */
    @GetMapping("/nantongGdp")
    public Result nantongGdp() {
        try {
            Result result = investmentService.nantongGdp();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取最近一个季度各区县GDP
     * @return
     */
    @GetMapping("/regionalGdp")
    public Result regionalGdp() {
        try {
            Result result = investmentService.regionalGdp();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取南通市地区生产总值构成
     * @return
     */
    @GetMapping("/gdpProportion")
    public Result gdpProportion() {
        try {
            Result result = investmentService.gdpProportion();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取南通市地区地区进口值
     * @return
     */
    @GetMapping("/nantongImport")
    public Result nantongImport() {
        try {
            Result result = investmentService.nantongImport();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取南通市人口情况
     * @return
     */
    @GetMapping("/nantongPopulation")
    public Result nantongPopulation() {
        try {
            Result result = investmentService.nantongPopulation();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取南通市房地产新开工面积概况
     * @return
     */
    @GetMapping("/newConstruction")
    public Result newConstruction() {
        try {
            Result result = investmentService.newConstruction();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }

    /**
     * 获取南通市房地产施工、竣工、销售数据
     * @return
     */
    @GetMapping("/realEstateArea")
    public Result realEstateArea() {
        try {
            Result result = investmentService.realEstateArea();
            return result;
        } catch (Exception e){
            return new Result<>(false, e.getMessage());
        }
    }
}
