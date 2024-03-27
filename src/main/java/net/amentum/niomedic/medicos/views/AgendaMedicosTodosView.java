package net.amentum.niomedic.medicos.views;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Agenda de los Médicos")

public class AgendaMedicosTodosView implements Serializable {
    private Integer idagenda;
    private String codp;
    private String descripcionp;
    private Date fechaingresoinst;
    private String idmedico;
    private Boolean meddom;
    private Boolean medlun;
    private Boolean medmar;
    private Boolean medmie;
    private Boolean medjue;
    private Boolean medvie;
    private Boolean medsab;
    private String escolaridad1;
    private Boolean tituloprofesional1;
    private String escolaridad2;
    private Boolean tituloprofesional2;
    private String escolaridad3;
    private Boolean tituloprofesional3;
    private String residenciamedica;
    private String anodelaresidencia;
    private String certificadopor;
    private Boolean cuentaconfiel;
    private Boolean vigenciadefiel;
    private Date fechadeingresoderegistro;
    private Double salario;
    private String horadeentrada;
    private String horadesalida;
    private Time lunEntMat;
    private Time lunSalMat;
    private Time lunEntVesp;
    private Time lunSalVesp;
    private Time lunEntNoct;
    private Time lunSalNoct;
    private Time marEntMat;
    private Time marSalMat;
    private Time marEntVesp;
    private Time marSalVesp;
    private Time marEntNoct;
    private Time marSalNoct;
    private Time mieEntMat;
    private Time mieSalMat;
    private Time mieEntVesp;
    private Time mieSalVesp;
    private Time mieEntNoct;
    private Time mieSalNoct;
    private Time jueEntMat;
    private Time jueSalMat;
    private Time jueEntVesp;
    private Time jueSalVesp;
    private Time jueEntNoct;
    private Time jueSalNoct;
    private Time vieEntMat;
    private Time vieSalMat;
    private Time vieEntVesp;
    private Time vieSalVesp;
    private Time vieEntNoct;
    private Time vieSalNoct;
    private Time sabEntMat;
    private Time sabSalMat;
    private Time sabEntVesp;
    private Time sabSalVesp;
    private Time sabEntNoct;
    private Time sabSalNoct;
    private Time domEntMat;
    private Time domSalMat;
    private Time domEntVesp;
    private Time domSalVesp;
    private Time domEntNoct;
    private Time domSalNoct;
}
