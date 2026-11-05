package dev.tiagonascimento.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {this.missoesRepository = missoesRepository;}

    //listar missoes do banco de dados
    public List<MissoesModel> listarMissoes() {return missoesRepository.findAll();}

    //listar missoes por Id
    public MissoesModel buscarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    //Deletar uma missao da lista
    public void deletarMissaoPorId(Long id) {missoesRepository.deleteById(id);}

    //cadastrar nova missao
    public MissoesModel cadastrarNovaMissao(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

}
