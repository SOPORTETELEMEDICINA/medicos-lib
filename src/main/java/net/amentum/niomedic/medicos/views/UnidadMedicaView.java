package net.amentum.niomedic.medicos.views;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos de la Unidad Médica")
public class UnidadMedicaView implements Serializable {

   private static final long serialVersionUID = -5306708886129728942L;

   @ApiModelProperty(value = "El ID", allowEmptyValue = true)
   private Long idUnidadMedica;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,15]")
   @NotBlank(message = "No puede ser nulo o vacío")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String clues;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String fkEntidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String fkCveMunicipio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String fkCveLocalidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   private String nombreJurisdiccion;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveJurisdiccion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   private String nombreInstitucion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String claveInstitucion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String claveCortaInstitucion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,30]")
   @Size(max = 30, message = "Máximo 30 caracteres")
   private String nombreTipoEstablecimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,5]")
   @Size(max = 5, message = "Máximo 5 caracteres")
   private String claveTipoEstablecimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,125]")
   @Size(max = 125, message = "Máximo 125 caracteres")
   private String nombreTipologia;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String claveTipologia;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String nombreSubtipologia;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveSubtipologia;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveScian;

   @ApiModelProperty(allowEmptyValue = true)
   private String descripcionClaveScian;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String consultoriosMedGral;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String consultoriosOtrasAreas;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String totalConsultorios;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String camasAreaHos;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String camasOtrasAreas;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String totalCamas;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   @NotBlank(message = "No puede ser nulo o vacío")
   private String nombreUnidad;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveVialidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String tipoVialidad;

   @ApiModelProperty(allowEmptyValue = true)
   private String vialidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String numeroExterior;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String numeroInterior;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveTipoAsentamiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String tipoAsentamiento;

   @ApiModelProperty(allowEmptyValue = true)
   private String asentamiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String entreTipoVialidad1;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String entreVialidad1;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String entreTipoVialidad2;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 255, message = "Máximo 255 caracteres")
   private String entreVialidad2;

   @ApiModelProperty(allowEmptyValue = true)
   private String observacionesDireccion;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,12]")
   @Size(max = 12, message = "Máximo 12 caracteres")
   @NotBlank(message = "No puede ser nulo o vacío")
   private String codigoPostal;

   @ApiModelProperty(allowEmptyValue = true)
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String estatusOperacion;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveEstatusOperacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   private String tieneLicenciaSanitaria;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String numeroLicenciaSanitaria;

   @ApiModelProperty(allowEmptyValue = true)
   private String tieneAvisoFuncionamiento;

   @ApiModelProperty(allowEmptyValue = true)
   private String fechaEmisionAvFun;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String rfcEstablecimiento;

   @ApiModelProperty(allowEmptyValue = true)
   private String fechaConstruccion;

   @ApiModelProperty(allowEmptyValue = true)
   private String fechaInicioOperacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,15]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String unidadMovilMarca;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String unidadMovilModelo;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String unidadMovilCapacidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String unidadMovilPrograma;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String unidadMovilClavePrograma;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String unidadMovilTipo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,12]")
   @Size(max = 12, message = "Máximo 12 caracteres")
   private String unidadMovilClaveTipo;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String unidadMovilTipologia;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String unidadMovilClaveTipologia;

   @ApiModelProperty(allowEmptyValue = true)
   @Digits(integer = 3, fraction = 6, message = "Sólo 3 dígitos antes del punto y 6 dígitos después del mismo")
   private String longitud;

   @ApiModelProperty(allowEmptyValue = true)
   @Digits(integer = 3, fraction = 6, message = "Sólo 3 dígitos antes del punto y 6 dígitos después del mismo")
   private String latitud;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,150]")
   @Size(max = 150, message = "Máximo 150 caracteres")
   private String nombreInsAdm;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveInsAdm;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String nivelAtencion;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveNivelAtencion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String estatusAcreditacion;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveEstatusAcreditacion;

   @ApiModelProperty(allowEmptyValue = true)
   private String acreditaciones;

   @ApiModelProperty(allowEmptyValue = true)
   private String subacreditacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String estratoUnidad;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveEstratoUnidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,30]")
   @Size(max = 30, message = "Máximo 30 caracteres")
   private String tipoObra;

   @ApiModelProperty(allowEmptyValue = true)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private String claveTipoObra;

   @ApiModelProperty(allowEmptyValue = true)
   private String horarioAtencion;

   @ApiModelProperty(allowEmptyValue = true)
   private String areasServicios;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,15]")
   @Size(max = 15, message = "Máximo 15 caracteres")
   private String ultimoMovimiento;

   @ApiModelProperty(allowEmptyValue = true)
   private String fechaUltimoMovimiento;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,40]")
   @Size(max = 40, message = "Máximo 40 caracteres")
   private String certificacionCsg;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,30]")
   @Size(max = 30, message = "Máximo 30 caracteres")
   private String tipoCertificacion;

   @ApiModelProperty(allowEmptyValue = true)
   private String vigenciaCertificacion;
   //nuevo campo para las busquedas

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 30, message = "Máximo 255 caracteres")
   private String nombreEntidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 30, message = "Máximo 255 caracteres")
   private String nombreMunicipio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 30, message = "Máximo 255 caracteres")
   private String nombreLocalidad;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   @Size(max = 30, message = "Máximo 255 caracteres")
   private String motivoBaja;

   @ApiModelProperty(allowEmptyValue = true)
   private String fechaEfectivaBaja;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,255]")
   private Integer idRegionSanitaria;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede se nulo")
   private Boolean activo;

}
