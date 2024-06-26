package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
//@RequiredArgsConstructor
public class UsuarioService {
//    @NonNull
    private final UsuarioRepository usuarioRepository;

    public Usuario cadastroUsuario(Usuario usuario) {
//        usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(Integer id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException();
        }
    }
}
