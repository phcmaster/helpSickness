package br.com.helpSickness.model.entity;

import br.com.helpSickness.model.enums.GrauDosSintomasEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name ="TB_SINTOMAS")
public class SintomasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_SINTOMA")
    private Long idSintoma;

    @Column(name = "NOME_DO_SINTOMA")
    private String nomeDoSintoma;

    @Column(name = "GRAU_SINTOMAS")
    private GrauDosSintomasEnum grauDosSintomasEnum;


    @Override
    public String toString() {
        return "SintomasEntity{" +
                "idSintoma=" + idSintoma +
                ", nomeDoSintoma='" + nomeDoSintoma + '\'' +
                ", grauDosSintomasEnum=" + grauDosSintomasEnum +
                '}';
    }
}
