package automovilpoo;

import java.util.Scanner;

/***********************************************
* AutomovilPoo.java
* Yellsmy Toj
*
* Este archivo contiene el main que funciona como driver para 
* la clase Automovil
***********************************************/

public class AutomovilPoo
{
    Scanner opción = new Scanner(System.in);       // Capturar la opción ingresada
    Automóvil clase = new Automóvil("Toyota",2015,"200","gasolina","Familiar",'4','5',120,"Rojo",0);
    
    //**************************************************************
    
    // Método menú que mostrará las funciones en éste programa y ejecutará
    // según la opción deseada
    void menú()
    {   
        boolean salir = false;
        int seleccion;
        int capturaIngresoDato;
        while (!salir)
        {
            System.out.println("|---------------------BIENVENIDO--------------------|");
            System.out.println("| 1. ¿Deseas acelerar?                              |");
            System.out.println("| 2. ¿Deseas desacelerar?                           |");
            System.out.println("| 3. ¿Deseas frenar?                                |");
            System.out.println("| 4. ¿Deseas una estimación del tiempo de llegada?  |");
            System.out.println("| 0. Finalizar viaje                                |");
            System.out.println("|___________________________________________________|");
            seleccion = opción.nextInt();  // Capturamos el dato ingresado
            opción.nextLine();
            switch (seleccion)
            {            
                // Si seleccionamos la opción 1, se ejecutará el método para agregar datos al árbol 1
                case 1:
                    System.out.println("Ingrese la velocidad a acelerar: ");
                    capturaIngresoDato = opción.nextInt();
                    if (clase.getVelocidadActual() > clase.getVelocidadMax())
                    {
                        System.out.println("Lo sentimos, la velocidad a la que quieres acelerar sobrepasa la \n capacidad máxima");                   
                    }
                    else
                    {
                        clase.acelerar(capturaIngresoDato);
                        System.out.println("Has acelerado ");
                        System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                        System.out.println("────▄▄▄▄▄▄──────");
                        System.out.println("─▄▄██┌┐█┌┐█▄▄▄▄─");
                        System.out.println("─██████████████─");
                        System.out.println("─▀▀◯▀▀▀▀▀▀▀▀◯▀─");
                    }                 
                    break;

                // Si seleccionamos la opción 2, se ejecutará el método para agregar datos al árbol 2
                case 2:
                    System.out.println("Ingrese cuánto desea desacelerar: ");
                    capturaIngresoDato = opción.nextInt();
                    if (capturaIngresoDato < 0)
                    {
                        System.out.println("La cantidad que desea desacelerar es inválida");
                        System.out.println("Recuerda no puedes desacelerar cantidades menores a cero");
                    }
                    else
                    {
                        clase.desacelerar(capturaIngresoDato);
                        System.out.println("Has desacelerado");
                        System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                    }                   
                    break;           

                // Al ingresar el número 3, primero se consultará que los árboles no estén vacíos
                // sino se ejecutará el método para comparar los árboles
                case 3:
                    clase.frenar();
                    System.out.println("Has frenado");
                    System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                    break;

                // Si el usuario selecciona la opción 3, se ejecutará el método para calcular el 
                // tiempo estimado de llegada de la clase Automóvil
                case 4:
                    System.out.println("Ingresa la distancia a rrecorrer en km: ");
                    capturaIngresoDato = opción.nextInt();
                    System.out.println("El tiempo estimado de llegada es: "+clase.tiempoEstimadoLlegada(capturaIngresoDato));             
                    break;
                case 0:
                    salir = true;               
                    break;

                default:
                    System.out.println("La opción ingresada es incorrecta");          
            }  // end switch
        }  // end while
    }  // end menú
    
    //**************************************************************

    public static void main(String[] args)
    {
        AutomovilPoo auto1 = new AutomovilPoo();
        auto1.menú();
    }
    
}
