/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import java.util.Random;

/**
 *
 * @author Lenovo I7
 */
public class Gaseoso extends Planeta{

    public Gaseoso() {
    }

    public Gaseoso(String nombre) {
        super(nombre);
    }

    public Gaseoso(int tamanio, int peso, String nombre, int x, int y) {
        super(tamanio, peso, nombre, x, y);
    }
    
    @Override
    public int probabilidad(){
        int pro=1;
        Random r=new Random();
        int a=0+r.nextInt(100);
        if(a<=20){
            pro=2;
        }
        return pro;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
