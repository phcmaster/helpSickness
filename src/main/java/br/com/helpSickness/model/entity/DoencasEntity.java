package br.com.helpSickness.model.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
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
    @Column(name = "FK_SINTOMAS")
    private List<SintomasEntity> sintomas;


    @OneToMany
    @Column(name = "FK_TRATAMENTOS")
    private List<TratamentosEntity> tratamentos;

    @Column(name = "DESCRICAO")
    private String descricao;


    @Override
    public String toString() {
        return "DoencasEntity{" +
                "idDoenca=" + idDoenca +
                ", nomeDaDoenca='" + nomeDaDoenca + '\'' +
                ", sintomas=" + sintomas +
                ", tratamentos=" + tratamentos +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
