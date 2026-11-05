package dev.tiagonascimento.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {this.missoesService = missoesService;}

    //listar todas as missoes do bando de dados
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() { return missoesService.listarMissoes();}

    //listar missoes por Id
    @GetMapping("/listar/{id}")
    public MissoesModel buscarMissoesPorId(@PathVariable Long id) {
        return missoesService.buscarMissoesPorId(id);
    }

    //Teste se esta rodando
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Minha primeira mensagem nessa rota";
    }

    //Deleta uma missao do bando de dados
    @DeleteMapping("/deletar/{id}")
    public void deletarMissoesPorId(@PathVariable Long id) {missoesService.deletarMissaoPorId(id);}

    //Cadastra nova missao no bando de dados
    @PostMapping("/criar")
    public MissoesModel cadastrarNovaMissao(@RequestBody MissoesModel missoesModel) {
        return missoesService.cadastrarNovaMissao(missoesModel);
    }
}
