package net.amentum.niomedic.medicos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoAgendaPageView {
    private static final long serialVersionUID = -4972403962255650613L;
    private String idMedico;
    private String nombre;
    private String curp;
    private String email;
    private Long idUsuario;
    private String userName;
    private Collection<EspecialidadView> especialidadViewList = new ArrayList<>();
    private String especialidades;
    private Integer idUnidadMedica;
    private AgendaMedicosView agenda;

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
                ", idUnidadMedica='" + idUnidadMedica + '\'' +
                '}';
    }

}
