package org.example;

public class LojaOnlineFactory {

    private static LojaOnlineFactory instance;

    private LojaOnlineFactory() {}

    public static synchronized LojaOnlineFactory getInstance() {
        if (instance == null) {
            instance = new LojaOnlineFactory();
        }
        return instance;
    }

    public Produto criarProduto(String tipo) {
        if (tipo.equalsIgnoreCase("eletronico")) {
            return new Eletronico();
        } else if (tipo.equalsIgnoreCase("livro")) {
            return new Livro();
        }
        return null;
    }
}