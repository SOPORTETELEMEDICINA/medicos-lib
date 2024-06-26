package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Datos de la firma del médico")
public class MedicoFirmaView implements Serializable {
    private Integer idFirmaMedico;
    private String nombre;
    private String contenido;
    private Date fechaCreacion;
}
