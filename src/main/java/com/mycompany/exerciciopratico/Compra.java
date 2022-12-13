package com.mycompany.exerciciopratico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Compra {
    
    private int codigo;
    private Date dataCompra;
    private float valorCompra;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public Compra incluirCompra(){
        
        try{
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("DIGITE O CODIGO DA COMPRA: ");
            setCodigo(input.nextInt());
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
            
            System.out.println("DIGITE A DATA DA COMPRA: ");
            setDataCompra(formato.parse(input.next()));
            
            
        }catch (ParseException e){
            e.printStackTrace();
        }
        
        return this;
    }
    
    
}
