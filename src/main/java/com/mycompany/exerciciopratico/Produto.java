package com.mycompany.exerciciopratico;

import java.util.Scanner;

public class Produto {
    
    private int codigo;
    private String nome;
    private float valorVenda;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public Produto incluirProduto(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("DIGITE O CODIGO DO PRODUTO ");
        setCodigo(input.nextInt());
        
        System.out.println("DIGITE O NOME DO PRODUTO");
        setNome(input.next());
        
        System.out.println("digite o valor de venda do produto");
        setValorVenda(input.nextFloat());
        
        return this;
        
        
    }
    
    
    
}
