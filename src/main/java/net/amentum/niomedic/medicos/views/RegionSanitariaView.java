package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Datos de regiones sanitarias")
public class RegionSanitariaView implements Serializable {

    private static final long serialVersionUID = 6126932423397168390L;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer idRs;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 10, message = "Máximo 10 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsNum;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsEdo;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 100, message = "Máximo 100 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsNom;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 200, message = "Máximo 200 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsDom;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCp;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 100, message = "Máximo 100 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsMun;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 200, message = "Máximo 200 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsDir;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 200, message = "Máximo 200 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsEst;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 100, message = "Máximo 100 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsEmail;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 100, message = "Máximo 100 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsCon1;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon1Lada;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon1Tel;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon1Ext;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @Size(max = 100, message = "Máximo 100 caracteres")
    @NotEmpty(message = "No puede ser nulo o vacío")
    private String rsCon2;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon2Lada;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon2Tel;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsCon2Ext;

    @ApiModelProperty(required = true, allowEmptyValue = false)
    @NotEmpty(message = "No puede ser nulo o vacío")
    private Integer rsActivo;
}
