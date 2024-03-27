package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Domicilios de los Médicos")
public class DomicilioView implements Serializable {

   private static final long serialVersionUID = 5019205138322576063L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idDomicilio;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String domicilio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String localidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String municipio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String estado;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String pais;

   @ApiModelProperty(value = "Código Postal", allowableValues = "range[1,5]")
   @Size(max = 6, message = "Máximo 6 caracteres")
   private String cp;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,10]")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String telefonoFijo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,30]")
   @Size(max = 30, message = "Máximo 30 caracteres")
   private String registroSanitario;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String tipo; // particular, hospital(es)

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String horarioAtencion; // GGR20200731 agrego horario de atención
}
