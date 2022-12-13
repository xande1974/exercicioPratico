package com.mycompany.exerciciopratico;

import java.util.ArrayList;
import java.util.List;

public class ItensCompra {
    
    private Produto produto = new Produto();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    List<Produto> listaProdutos = new ArrayList<Produto>();
     public List<Produto> itensCompra(Produto produto){
         
         setProduto(produto);
         listaProdutos.add(this.produto);
         
         return listaProdutos;
         
         
    }
        
        
    
}
