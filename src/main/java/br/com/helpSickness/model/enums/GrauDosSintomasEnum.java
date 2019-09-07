package br.com.helpSickness.model.enums;

public enum GrauDosSintomasEnum {

    GRAVE("G"), MODERADO("M"), BAIXO("B");

    private String valor;

    GrauDosSintomasEnum(String valor) {
        this.valor = valor;
    }
}
