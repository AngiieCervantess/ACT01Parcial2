/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoclass;

/**
 *
 * @author Angelica
 */
public class NodoClass{

    public int n;
    public NodoClass siguiente;
    public NodoClass anterior;
        
    //constructor
    public void NodoClass(){
    this.n = 0;
    this.siguiente = null;
    this.anterior = null;
    }
    
    //Métodos Get y Set

    public int getDato() {
        return n;  }
    public void setDato(int dato) {
        this.n = dato;  }

    
    public NodoClass getSiguiente() {
        return siguiente;}
    public void setSiguiente(NodoClass siguiente) {
        this.siguiente = siguiente;}
    
    
    public NodoClass getAnterior() {
        return anterior; }
    public void setAnterior(NodoClass anterior) {
        this.anterior = anterior; }
    
    
    
}

