package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    //    @Autowired
    private UsuarioService usuarioService;

    @PostMapping()
    public String cadastroUsuario(@RequestBody Usuario usuario) {
        usuario = usuarioService.cadastroUsuario(usuario);
        return "Olá " + usuario.getNome() + ".\n" + usuario;
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(
            @PathVariable Integer id
    ) {
        return usuarioService.buscarUsuario(id);
    }

//    @PutMapping("/{id}")
//    public String endPointPut(@PathVariable int id, @RequestBody String sobrenome) {
//        return "Seu sobrenome é " + sobrenome + ", seu ID é " + id + " e isso é um PUT!";
//    }

//    @PatchMapping
//    public String endPointPatch(@PathVariable int id, @RequestBody String apelido) {
//        return "Esse é seu apelido: " + apelido + ", seu ID é " + id + " e isso é um PATCH!";
//    }

    //O RequestBody pode ser usado apenas uma vez,
    //Para solucionar isso, basta usar formData


    //    @DeleteMapping("/{id}/{id2}")
//    @DeleteMapping("/{id}")
//    public String endPointDelete(@PathVariable int id
////                                 @PathVariable int id2
////    @PathVariable(value = "id") int identificador
//    ) {
//        return "Objeto de ID: " + id + " foi deletado através do DELETE!";
//    }
}
