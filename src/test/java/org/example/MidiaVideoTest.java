package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidiaVideoTest {

    @Test
    void deveReproduzirVideo() {
        IMidia tipo = MidiaFactory.criarMidia("Video");
        assertEquals("Exibindo video", tipo.reproduzir());
    }

    @Test
    void devePausarVideo() {
        IMidia tipo = MidiaFactory.criarMidia("Video");
        assertEquals("Pausando video", tipo.pausar());
    }

    @Test
    void devePararVideo() {
        IMidia tipo = MidiaFactory.criarMidia("Video");
        assertEquals("Parando video", tipo.parar());
    }

}