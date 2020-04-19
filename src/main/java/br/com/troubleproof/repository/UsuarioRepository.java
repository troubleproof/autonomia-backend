package br.com.troubleproof.repository;

import br.com.troubleproof.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    void deleteById(Integer id);

}
