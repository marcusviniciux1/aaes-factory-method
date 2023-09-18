package org.example;

public class MidiaVideo implements IMidia {
    public String reproduzir() {
        return "Exibindo video";
    }

    public String pausar() {
        return "Pausando video";
    }

    public String parar() {
        return "Parando video";
    }
}