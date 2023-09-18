package org.example;

public class MidiaFactory {
    public static IMidia criarMidia(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Midia" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de mídia inexistente");
        }
        if (!(objeto instanceof IMidia)) {
            throw new IllegalArgumentException("Tipo de mídia inválido");
        }
        return (IMidia) objeto;
    }
}