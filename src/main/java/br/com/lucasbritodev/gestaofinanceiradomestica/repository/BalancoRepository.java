package br.com.lucasbritodev.gestaofinanceiradomestica.repository;

import br.com.lucasbritodev.gestaofinanceiradomestica.modelo.Balanco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalancoRepository extends JpaRepository<Balanco, Long> {

    Page<Balanco> findByLancadorNome(String nomeLancador, Pageable paginacao);

}
