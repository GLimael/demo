package br.senai.sc.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class PrimeiroEndPointController {
    @GetMapping
    public String endPointGet(
//            @RequestParam String parametro
    ) {
        return "GET!";
    }

    @PostMapping("/{id}")
    public String ednPointPost(@PathVariable int id, @RequestBody String nome) {
        return "Olá " + nome + ", isso é um POST! Seu id é: " + id + "!";
    }

    @PutMapping("/{id}")
    public String endPointPut(@PathVariable int id, @RequestBody String sobrenome) {
        return "Seu sobrenome é " + sobrenome + ", seu ID é " + id + " e isso é um PUT!";
    }

    @PatchMapping
    public String endPointPatch(@PathVariable int id, @RequestBody String apelido) {
        return "Esse é seu apelido: " + apelido + ", seu ID é " + id + " e isso é um PATCH!";
    }

    //O RequestBody pode ser usado apenas uma vez,
    //Para solucionar isso, basta usar formData


//    @DeleteMapping("/{id}/{id2}")
    @DeleteMapping("/{id}")
    public String endPointDelete(@PathVariable int id
//                                 @PathVariable int id2
//    @PathVariable(value = "id") int identificador
    ) {
        return "Objeto de ID: " + id + " foi deletado através do DELETE!";
    }
}
