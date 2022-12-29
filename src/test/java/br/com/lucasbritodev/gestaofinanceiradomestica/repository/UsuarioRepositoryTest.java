package br.com.lucasbritodev.gestaofinanceiradomestica.repository;

import br.com.lucasbritodev.gestaofinanceiradomestica.modelo.Usuario;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private TestEntityManager em;

    @Test
    public void deveriaCarregarUmUsuarioAoBuscarPeloSeuEmail() {
        String emailUsuario = "gabi.gcoimbra@gmail.com";

        Usuario gabriela = new Usuario();
        gabriela.setEmail(emailUsuario);
        gabriela.setNome("Gabriela");
        em.persist(gabriela);

        Optional<Usuario> usuario = repository.findByEmail(emailUsuario);
        Assert.assertTrue(usuario.isPresent());
        usuario.ifPresent(value -> Assert.assertEquals(emailUsuario, value.getEmail()));
    }

    @Test
    public void naoDeveriaCarregarUmUsuarioCujoEmailNaoEstejaCadastrado() {
        String emailUsuario = "invalido@email.com";
        Optional<Usuario> usuario = repository.findByEmail(emailUsuario);
        Assert.assertFalse(usuario.isPresent());
    }

}
