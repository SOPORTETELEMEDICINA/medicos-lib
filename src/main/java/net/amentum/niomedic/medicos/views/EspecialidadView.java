package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Especialidad de los Médicos")
public class EspecialidadView implements Serializable {

   private static final long serialVersionUID = 8843530299232903396L;

   @ApiModelProperty(value = "El ID es un UUID",  allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idEspecialidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String especialidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String subespecialidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,200]")
   @Size(max = 200, message = "Máximo 200 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String universidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String cedula;

   private String nombreImagenCedula;

   private String nombreImagenDiploma;

   private String imgCedula64;

   private String imgTitulo64;

   private Boolean validado;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(value = "Es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaValidacion;


   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String cedulaExtranjera;



}

