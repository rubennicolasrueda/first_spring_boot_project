package com.chanceIT.cliente_project.controllers;

import com.chanceIT.cliente_project.entities.Cliente;
import com.chanceIT.cliente_project.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //identify the class as a component for component scanning
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public String homeRedirect(){
        String url = "redirect:/clientes";
        return url;
    }

    @GetMapping("/clientes")//if you received a get method
    public String getClientes(Model model){
        model.addAttribute("clientes", clienteRepository.findByOrderByIdDesc());
        return "index";
    }


    @PostMapping("/clientes")
    public String newCliente(@ModelAttribute Cliente cliente){
        clienteRepository.save(cliente);
        String url = "redirect:/clientes";
        return url;
    }
}
