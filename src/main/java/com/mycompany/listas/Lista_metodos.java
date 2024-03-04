package com.mycompany.listas;

public class Lista_metodos {
    Nodo inicio;
    Nodo fin;
    
    public Lista_metodos(){
        inicio = null;
        fin = null;
    }
    
    public void insertarInicio(String dato){
        Nodo nuevo = new Nodo(dato, inicio);
        inicio = nuevo;
        if(fin == null)
            fin = inicio;
    }
    
    public void insertarFinal(String dato){
        Nodo nuevo = new Nodo(dato, null);
        if(inicio == null){
            fin = nuevo;
            inicio = fin;
        }else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void eliminarInicio(){
        inicio = inicio.siguiente;
    }
    
    public String extraerInicio(){
        String dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if(inicio == null){
            fin = null;
        }
        return dato;
    }
    
    public void mostrarLista(){
        Nodo temp = inicio;
        
        while(temp != null){
            System.out.println(temp.getDato());
            temp = temp.siguiente;
        }
    }
    
}
