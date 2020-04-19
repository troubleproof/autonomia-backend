package br.com.troubleproof.controller;

import br.com.troubleproof.entity.Usuario;
import br.com.troubleproof.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @GetMapping("{id}")
    public Usuario getById(@PathVariable Integer id) {
        return usuarioRepository.findById(id).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Integer id) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        usuarioRepository.deleteById(id);
    }

}
