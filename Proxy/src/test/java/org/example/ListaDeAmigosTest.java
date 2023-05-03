package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListaDeAmigosTest {

    private ListaDeAmigos listaDeAmigosProxyAutorizado;
    private ListaDeAmigos listaDeAmigosProxyNaoAutorizado;

    @BeforeEach
    public void setUp() {
        listaDeAmigosProxyAutorizado = new ListaDeAmigosProxy("usuario autorizado");
        listaDeAmigosProxyNaoAutorizado = new ListaDeAmigosProxy("usuario nao autorizado");
    }

    @Test
    public void testAcessoAutorizado() {
        List<String> amigos = listaDeAmigosProxyAutorizado.getListaDeAmigos();
        Assertions.assertNotNull(amigos);
        Assertions.assertFalse(amigos.isEmpty());
    }

    @Test
    public void testAcessoNaoAutorizado() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            listaDeAmigosProxyNaoAutorizado.getListaDeAmigos();
        });
    }
}
