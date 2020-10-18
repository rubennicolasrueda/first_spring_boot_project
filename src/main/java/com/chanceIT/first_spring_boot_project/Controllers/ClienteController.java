package com.chanceIT.first_spring_boot_project.Controllers;

import com.chanceIT.first_spring_boot_project.Entities.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller //identify the class as a component for component scanning
public class ClienteController {

    @GetMapping("/Cliente")//if you received a get method
    public String home(){
        return "index";
    }


    @PostMapping("/Cliente")
    public void newCliente(@RequestBody Cliente cliente){
        System.out.println(cliente);
        System.out.println("cliente creado");

    }
}
