package filicom.web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//controlador REST e todos os métodos da classe responderão a solicitações HTTP.
public class WelcomeController {

    @GetMapping
    //vincula o método a requisições do tipo GET.
    public String welcome() {
        return "My Spring Boot Api";
    }
}
