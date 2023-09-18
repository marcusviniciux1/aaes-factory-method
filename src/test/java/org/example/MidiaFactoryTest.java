package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidiaFactoryTest {

    @Test
    void deveRetornarExcecaoParaMidiaInexistente() {
        try {
            IMidia tipo = MidiaFactory.criarMidia("Documento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de mídia inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMidiaInvalido() {
        try {
            IMidia tipo = MidiaFactory.criarMidia("Foto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de mídia inválido", e.getMessage());
        }
    }

}