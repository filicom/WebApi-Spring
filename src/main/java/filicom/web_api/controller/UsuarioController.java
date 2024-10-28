package filicom.web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import filicom.web_api.model.Usuario;
import filicom.web_api.repository.UserRepository;

@RestController
public class UsuarioController {

    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.listAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUserName(username);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.remove(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("/users")
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
