package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidiaAudioTest {

    @Test
    void deveReproduzirAudio() {
        IMidia tipo = MidiaFactory.criarMidia("Audio");
        assertEquals("Exibindo audio", tipo.reproduzir());
    }

    @Test
    void devePausarAudio() {
        IMidia tipo = MidiaFactory.criarMidia("Audio");
        assertEquals("Pausando audio", tipo.pausar());
    }

    @Test
    void devePararAudio() {
        IMidia tipo = MidiaFactory.criarMidia("Audio");
        assertEquals("Parando audio", tipo.parar());
    }

}