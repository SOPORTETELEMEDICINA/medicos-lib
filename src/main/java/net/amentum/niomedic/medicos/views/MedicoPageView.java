package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Los datos que se regresan en el SEARCH de los Médicos")
public class MedicoPageView  implements Serializable {
	
	private static final long serialVersionUID = -4972403962255650613L;
	
	private String idMedico;
	private String nombre;
	private String curp;
	private String email;
	private Long idUsuario;
	private String userName;
	private Collection<EspecialidadView> especialidadViewList = new ArrayList<>();
	private String especialidades;
	private String IdUsuarioZoom;
	private Integer idUnidadMedica;
	private Boolean descripcionPuesto;

	@Override
	public String toString() {
		return "MedicoPageView{" +
				"idMedico='" + idMedico + '\'' +
				", nombre='" + nombre + '\'' +
				", curp='" + curp + '\'' +
				", email='" + email + '\'' +
				", idUsuario=" + idUsuario +
				", userName='" + userName + '\'' +
				", especialidades='" + especialidades + '\'' +
				", IdUsuarioZoom='" + IdUsuarioZoom + '\'' +
				", idUnidadMedica='" + idUnidadMedica + '\'' +
				", descripcionPuesto='" + descripcionPuesto + '\'' +
				'}';
	}
}
