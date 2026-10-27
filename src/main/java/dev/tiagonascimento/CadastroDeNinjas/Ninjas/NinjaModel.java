package dev.tiagonascimento.CadastroDeNinjas.Ninjas;

import dev.tiagonascimento.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne um ninja tem uma unica missao por vez, mas varios ninjas podem estar na mesma missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
