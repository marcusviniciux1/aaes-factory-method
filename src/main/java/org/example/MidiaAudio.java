package org.example;

public class MidiaAudio implements IMidia {
    public String reproduzir() {
        return "Exibindo audio";
    }

    public String pausar() {
        return "Pausando audio";
    }

    public String parar() {
        return "Parando audio";
    }
}