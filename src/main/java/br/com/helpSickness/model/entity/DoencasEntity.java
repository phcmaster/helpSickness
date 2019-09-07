package br.com.helpSickness.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name ="TB_DOENCAS")
public class DoencasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DOENCA")
    private Long idDoenca;

    @Column(name = "NOME_DA_DOENCA")
    private String nomeDaDoenca;

    @OneToMany
    @Column(name = "SINTOMAS")
    private List<SintomasEntity> sintomas;


    @OneToMany
    @Column(name = "SINTOMAS")
    private List<TratamentosEntity> tratamentos;


    @Override
    public String toString() {

        return "DoencasEntity{" +
                "idDoenca=" + idDoenca +
                ", nomeDaDoenca='" + nomeDaDoenca + '\'' +
                ", sintomas=" + sintomas +
                ", tratamentos=" + tratamentos +
                '}';
    }
}
