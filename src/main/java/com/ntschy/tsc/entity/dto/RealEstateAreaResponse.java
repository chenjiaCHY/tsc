package com.ntschy.tsc.entity.dto;

import com.ntschy.tsc.entity.DO.RealEstate;
import lombok.Data;

import java.util.List;

@Data
public class RealEstateAreaResponse {

    private List<RealEstate> constructionList;

    private List<RealEstate> completeList;

    private List<RealEstate> saleList;
}
