
package com.exemplo.app;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        System.out.println(json);
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
