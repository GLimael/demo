package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
//    @GetMapping
//    public String endPointGet(
////            @RequestParam String parametro
//    ) {
//        return "GET!";
//    }

    @PostMapping()
    public String ednPointPost(@RequestBody Usuario usuario) {
        return "Olá " + usuario.getNome() + ".\n" + usuario;
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
