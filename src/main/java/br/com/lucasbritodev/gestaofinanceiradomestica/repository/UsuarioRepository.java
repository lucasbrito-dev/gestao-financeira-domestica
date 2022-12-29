package br.com.lucasbritodev.gestaofinanceiradomestica.repository;

import br.com.lucasbritodev.gestaofinanceiradomestica.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
