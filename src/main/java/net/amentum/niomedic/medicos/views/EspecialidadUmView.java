package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Especialidad de la Unidad Médica de los Médicos")
public class EspecialidadUmView implements Serializable {

   private static final long serialVersionUID = -2062216544577234009L;

   @ApiModelProperty(value = "El ID", allowEmptyValue = true)
   private Long idEspecialidadUm;

   @ApiModelProperty(value = "Nombre de la especialidad",allowEmptyValue = true, allowableValues = "range[1,150]")
   @Size(max = 150)
   private String nombre;
}
