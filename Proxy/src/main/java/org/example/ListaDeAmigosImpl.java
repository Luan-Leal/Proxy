package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAmigosImpl implements ListaDeAmigos {
    private List<String> amigos;

    public ListaDeAmigosImpl() {
        amigos = new ArrayList<>();
    }

    public void adicionarAmigo(String amigo) {
        amigos.add(amigo);
    }

    @Override
    public List<String> getListaDeAmigos() {
        return amigos;
    }
}