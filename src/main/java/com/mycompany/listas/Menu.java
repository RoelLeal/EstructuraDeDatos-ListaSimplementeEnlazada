package com.mycompany.listas;

public class Menu {
    public static void main(String args []){
        Lista_metodos l = new Lista_metodos();
        /*
        l.insertarInicio("a");
        l.insertarInicio("b");
        l.insertarInicio("c");
        l.insertarInicio("d");
        l.insertarInicio("e");
        l.insertarInicio("f");
        */
        
        l.insertarFinal("a");
        l.insertarFinal("b");
        l.insertarFinal("c");
        l.insertarFinal("d");
        l.insertarFinal("e");
        l.insertarFinal("f");
        


        l.mostrarLista();
        
        System.out.println();
        l.eliminarInicio();
        l.mostrarLista();
        
        System.out.println();
        System.out.println(l.extraerInicio());
        System.out.println();
        l.mostrarLista();
    }
}