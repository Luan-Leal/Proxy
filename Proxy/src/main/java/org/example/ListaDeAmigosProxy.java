package org.example;

import java.util.List;

public class ListaDeAmigosProxy implements ListaDeAmigos {
    private ListaDeAmigos listaDeAmigos;
    private String usuario;

    public ListaDeAmigosProxy(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public List<String> getListaDeAmigos() {
        if (usuario.equals("usuario autorizado")) {
            if (listaDeAmigos == null) {
                listaDeAmigos = new ListaDeAmigosImpl();
                listaDeAmigos.adicionarAmigo("Amigo 1");
                listaDeAmigos.adicionarAmigo("Amigo 2");
                listaDeAmigos.adicionarAmigo("Amigo 3");
            }
            return listaDeAmigos.getListaDeAmigos();
        } else {
            throw new RuntimeException("Acesso não autorizado à lista de amigos");
        }
    }

    @Override
    public void adicionarAmigo(String s) {

    }
}

