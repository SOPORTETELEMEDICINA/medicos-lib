package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Datos de los Médicos")
public class MedicoView implements Serializable {

   private static final long serialVersionUID = 6126932423397168390L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private String idMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombre;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String apellidoPaterno;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String apellidoMaterno;

   @ApiModelProperty(required = true, dataType = "java.util.Date", example = "197650800")
   @NotNull(message = "No puede ser nulo o vacío")
   private Date fechaNacimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String lugarNacimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String estadoCivil;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String sexo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String curp;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String rfc;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Email(message = "email no válido")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String email;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String telefonoFijo;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String telefonoMovil;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String id_cat_nacionalidades;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String id_cat_entidades;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String id_institucion;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String per_id;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String act_id;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String atr_id;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String id_cat_clues;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String jor_id;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String id_cat_especialidades;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String con_id;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[0,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String pla_id;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   private Long idUsuario;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private String userName;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   private Boolean descripcionPuesto;

   private String idUsuarioZoom;
   private Integer idUnidadMedica;

   private Integer id_medico_firma;

   private MedicoFirmaView medicoFirma;

   //   las relaciones
   private Collection<DomicilioView> domicilioViewList = new ArrayList<>();
   private Collection<EspecialidadView> especialidadViewList = new ArrayList<>();


   @Override
   public String toString() {
      return "Medico {" +
              "idMedico=" + idMedico +
              ", nombre=" + nombre +
              ", apellidoPaterno=" + apellidoPaterno +
              ", apellidoMaterno=" + apellidoMaterno +
              ", fechaNacimiento=" + fechaNacimiento +
              ", lugarNacimiento=" + lugarNacimiento +
              ", estadoCivil=" + estadoCivil +
              ", sexo=" + sexo +
              ", curp=" + curp +
              ", rfc=" + rfc +
              ", email=" + email +
              ", telefonoFijo=" + telefonoFijo +
              ", telefonoMovil=" + telefonoMovil +
              ", id_cat_nacionalidades=" + id_cat_nacionalidades +
              ", id_cat_entidades=" + id_cat_entidades +
              ", id_institucion=" + id_institucion +
              ", per_id=" + per_id +
              ", act_id=" + act_id +
              ", atr_id=" + atr_id +
              ", id_cat_clues=" + id_cat_clues +
              ", jor_id=" + jor_id +
              ", id_cat_especialidades=" + id_cat_especialidades +
              ", con_id=" + con_id +
              ", pla_id=" + pla_id +
              ", id_medico_firma=" + id_medico_firma +
              ", medico_firma=" + medicoFirma +
              ", idUsuario=" + idUsuario +
              ", activo=" + activo +
              ", userName=" + userName +
              ", fechaCreacion=" + fechaCreacion +
              ", idUsuarioZoom=" + idUsuarioZoom +
              ", idUnidadMedica=" + idUnidadMedica +
              ", descripcionPuesto=" + descripcionPuesto +

              "}";
   }
}