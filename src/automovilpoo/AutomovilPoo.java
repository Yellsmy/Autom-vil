package automovilpoo;

import java.text.DecimalFormat;
import java.util.Scanner;
import Animacion.Dibujo;
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
        
        Dibujo animacionCarro= new Dibujo();
        boolean salir = false;
        int seleccion;
        int capturaIngresoDato;
        clase.mostrarDatos(); // Mostramos los datos del carro
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
                // Si seleccionamos la opción 1, se ejecutará el método para acelerar
                case 1:
                    System.out.println("Ingrese la velocidad a acelerar: ");                   
                    clase.acelerar(opción.nextInt());
                    System.out.println("Has acelerado ");
                    System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                    animacionCarro.animAcelerar();                                
                    break;

                // Si seleccionamos la opción 2, se ejecutará el método para desacelerar
                case 2:
                    System.out.println("Ingrese cuánto desea desacelerar: ");
                    capturaIngresoDato = opción.nextInt();
                    if (capturaIngresoDato < 0)
                    {
                        System.out.println("La cantidad que desea desacelerar es inválida");
                        System.out.println("Recuerda no puedes desacelerar cantidades menores a cero");
                    }  // end if
                    else
                    {
                        clase.desacelerar(capturaIngresoDato);
                        System.out.println("Has desacelerado");
                        System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                        animacionCarro.animDesacelerar();
                    }  // end else                  
                    break;           

                // Al ingresar el número 3, se ejecutará el método para frenar
                case 3:
                    clase.frenar();
                    System.out.println("Has frenado");
                    System.out.println("Tu velocidad actual es "+clase.getVelocidadActual()+" km/h");
                    animacionCarro.animfrenar();
                    break;

                // Si el usuario selecciona la opción 4, se ejecutará el método para calcular el 
                // tiempo estimado de llegada de la clase Automóvil
                case 4:
                    System.out.println("Ingresa la distancia a recorrer en km: ");
                    
                    // Almacenamos el resultado del cálculo correspondiente en una variable
                    float operacion=clase.tiempoEstimadoLlegada(opción.nextInt());
                    float decimal=operacion%1;  // Calculamos el módulo del resultado
                    float entero=operacion-decimal;  // Restamos el decimal al recultado
                    
                    // De la clase DecimalFormat instanseamos un objeto para que el valor decimal
                    // Solo tenga 2 decimales
                    DecimalFormat formatoDecimal = new DecimalFormat("#.00"); 
                    System.out.println("El tiempo estimado de llegada es: "+(int)entero+" hrs y "+formatoDecimal.format(decimal)+" min");
                    animacionCarro.animTiempoLlegada();
                    break;
                case 0:
                    System.out.println("---*Gracias por utilizar nuestro servicio*---");
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
