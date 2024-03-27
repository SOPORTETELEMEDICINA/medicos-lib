package net.amentum.niomedic.medicos.views;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Los datos que se regresan en el SEARCH de la Unidad Médica")
public class UnidadMedicaPageView implements Serializable {

	private static final long serialVersionUID = 3896358083606746316L;

	private Long idUnidadMedica;
	private String clues;
	private String nombreUnidad;
	private String codigoPostal;
	private Boolean activo;
}
