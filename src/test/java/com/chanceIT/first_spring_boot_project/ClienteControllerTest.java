package com.chanceIT.first_spring_boot_project;

import com.chanceIT.first_spring_boot_project.Controllers.ClienteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(ClienteController.class)

public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc; //injects mockmcv

    @Test
    public void someTest() throws Exception {
        //mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
    }
}
