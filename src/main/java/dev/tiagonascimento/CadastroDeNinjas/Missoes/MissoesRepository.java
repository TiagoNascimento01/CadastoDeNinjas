package dev.tiagonascimento.CadastroDeNinjas.Missoes;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
