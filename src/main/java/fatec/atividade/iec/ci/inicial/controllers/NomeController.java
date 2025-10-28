package fatec.atividade.iec.ci.inicial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nome")
public class NomeController {

    @GetMapping
    public String getNome(
            @RequestParam(defaultValue = "Diego Baltazar de Souza Cladio") String value
    ) {
        return "Bem vindo/a " + value;
    }
}
