package fatec.atividade.iec.ci.inicial.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NomeControllerTest {

    private final NomeController controller = new NomeController();

    @Test
    void deveRetornarNomeCorreto_quandoNaoPassaParametro(){
        String resultado = controller.getNome("Nome Informado");
        assertEquals("Bem vindo/a Nome Informado", resultado);
    }
}
