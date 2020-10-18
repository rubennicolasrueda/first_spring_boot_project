package com.chanceIT.first_spring_boot_project.Entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    private Long id;
    private String fnombre;
    private String fapellido;
    private String fedad;


    public Cliente(String fnombre, String fapellido, String fedad) {
        this.fnombre = fnombre;
        this.fapellido = fapellido;
        this.fedad = fedad;
    }

    public Long getId() {
        return id;
    }

    public String getFnombre() {
        return fnombre;
    }

    public String getFapellido() {
        return fapellido;
    }

    public String getFedad() {
        return fedad;
    }

    public void setFnombre(String fnombre) {
        this.fnombre = fnombre;
    }

    public void setFapellido(String fapellido) {
        this.fapellido = fapellido;
    }

    public void setFedad(String fedad) {
        this.fedad = fedad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "fnombre='" + fnombre + '\'' +
                ", fapellido='" + fapellido + '\'' +
                ", fedad='" + fedad + '\'' +
                '}';
    }
}
