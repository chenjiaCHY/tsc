package com.ntschy.tsc.entity.dto;

import com.ntschy.tsc.entity.DO.Population;
import lombok.Data;

import java.util.List;

@Data
public class PopulationResult {

    private List<Population> nantongPopulation;

    private List<Population> registerPopulation;

    private List<Population> urbanPopulation;
}
