package Animacion;
/***********************************************
* Dibujo.java
* Yellsmy Toj
*
* Este archivo contiene las funciones para mostrar un dibujo hecho con
* signos para cada función del automóvil
***********************************************/

public class Dibujo {
    
    //**************************************************************
    
    //Método para animar cuando el auto frena
    public void animfrenar()
    {
        
        System.out.println("────▄▄▄▄▄▄──────");
        System.out.println("─▄▄██┌┐█┌┐█▄▄▄▄─");
        System.out.println("─██████████████─");
        System.out.println("─▀▀◯▀▀▀▀▀▀▀▀◯▀─_");
        System.out.println("");
    }
    
    //**************************************************************
    
    //Método para animar cuando el auto desacelera   
    public void animDesacelerar()
    {
        System.out.println("────---------▄▄▄▄▄▄──────");
        System.out.println("---------─▄▄██┌┐█┌┐█▄▄▄▄─");
        System.out.println("---------─██████████████─");
        System.out.println("─---------▀▀◯▀▀▀▀▀▀▀▀◯▀─_________________________");
        System.out.println("");
    }
    
    //**************************************************************
    
    //Método para animar cuando el auto acelera
    public void animAcelerar()
    {
        System.out.println("────-------------------------------▄▄▄▄▄▄──────");
        System.out.println("------------------------------─▄▄██┌┐█┌┐█▄▄▄▄─");
        System.out.println("------------------------------─██████████████─");
        System.out.println("─------------------------------▀▀◯▀▀▀▀▀▀▀▀◯▀─______");
    }
    
    //**************************************************************
    
    //Método para animar cuando se calcula la estimacion de tiempo de llegada
    public void animTiempoLlegada()
    {
        System.out.println("────---------▄▄▄▄▄▄──────--------- ▄▀▀▀▀▀▄");      
        System.out.println("---------─▄▄██┌┐█┌┐█▄▄▄▄─----  █    ▐     █");     
        System.out.println("---------─██████████████─-- █    ▐▄▄    █");    
        System.out.println("─---------▀▀◯▀▀▀▀▀▀▀▀◯▀─---- █          █");     
        System.out.println("                                     ▀▄▄▄▄▄▀");      
    }
}  // end clase Dibujo
