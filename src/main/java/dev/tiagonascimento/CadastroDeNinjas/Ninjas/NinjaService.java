package dev.tiagonascimento.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Busca todos da lista
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Busca por ID
    public NinjaModel buscarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    // Cadastra novo ninja
    public NinjaModel cadastrarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

}
