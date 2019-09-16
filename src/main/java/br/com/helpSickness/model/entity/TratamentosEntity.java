package br.com.helpSickness.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name ="TB_TRATAMENTOS")
public class TratamentosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_TRATAMENTO")
    private Long idTratamento;

    @Column(name = "NOME_TRATAMENTO")
    private String nomeTratamento;


    @Override
    public String toString() {
        return "TratamentosEntity{" +
                "idTratamento=" + idTratamento +
                ", nomeTratamento='" + nomeTratamento + '\'' +
                '}';
    }
}
