
package com.mycompany.exerciciopratico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int qtdProdutos;
        float somatorioValorProduto = 0f;
        
        System.out.println("###INIAREMOS A NOSSA VENDA###\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("INFORME OS DADOS DA COMPRA\n");
        
        Compra compra = new Compra();
        
        compra.incluirCompra();
        
        System.out.println("INFORME A QUANTIDADE DE PRODUTOS\n");
        
        qtdProdutos = input.nextInt();
        
        ItensCompra itensCompra = new ItensCompra();
        
        List<Produto> listaProduto = new ArrayList<Produto>();
      
        for(int i=0; i<qtdProdutos;i++){
    
        Produto prod = new Produto();
        
        prod.incluirProduto();
        
        somatorioValorProduto = somatorioValorProduto + prod.getValorVenda();
        
            List<Produto> listaProdutos = itensCompra.itensCompra(prod);
        
        
    }
        
        compra.setValorCompra(somatorioValorProduto);
        
        imprimir(compra, listaProdutos);
    }
        
        public static void imprimir(Compra compra, List<Produtos> listaProdutos){
            
        }
}
