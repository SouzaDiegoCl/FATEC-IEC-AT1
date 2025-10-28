package fatec.atividade.iec.ci.inicial.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NomeController.class)
class NomeControllerTestIT {

    @Autowired
    MockMvc mockMvc;

    @Test
    void deveRetornarNomeCorreto_quandoNaoPassaParametro() throws Exception {
        mockMvc.perform(get("/nome?value=Nome Informado"))
                .andExpect(status().isOk())
                .andExpect(content().string("Bem vindo/a Nome Informado"));
    }
}
