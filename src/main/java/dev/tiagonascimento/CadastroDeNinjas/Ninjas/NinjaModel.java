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
    private Long id;
    private String name;
    private String email;
    private int idade;

    //@ManyToOne um ninja tem uma unica missao por vez, mas varios ninjas podem estar na mesma missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
