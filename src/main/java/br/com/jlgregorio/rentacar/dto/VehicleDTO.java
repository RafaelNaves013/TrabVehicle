package br.com.jlgregorio.rentacar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {

    private int id;
    private String modelName;
    private String assembler;
    private int manufactureYear;
    private int modelYear;

}
