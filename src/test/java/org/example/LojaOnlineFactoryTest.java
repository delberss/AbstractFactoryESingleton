package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LojaOnlineFactoryTest {

    @Test
    public void deveRetornarInstanciaUnica() {
        LojaOnlineFactory factory1 = LojaOnlineFactory.getInstance();
        LojaOnlineFactory factory2 = LojaOnlineFactory.getInstance();
        assertSame(factory1, factory2);
    }

    @Test
    public void deveCriarProdutoEletronico() {
        LojaOnlineFactory factory = LojaOnlineFactory.getInstance();
        Produto produto = factory.criarProduto("eletronico");
        assertTrue(produto instanceof Eletronico);
        assertEquals("Este é um produto eletrônico.", produto.descricao());
    }

    @Test
    public void deveCriarProdutoLivro() {
        LojaOnlineFactory factory = LojaOnlineFactory.getInstance();
        Produto produto = factory.criarProduto("livro");
        assertTrue(produto instanceof Livro);
        assertEquals("Este é um livro.", produto.descricao());
    }
}