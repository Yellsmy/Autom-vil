package automovilpoo;
/***********************************************
* Automóvil.java
* Yellsmy Toj
*
* Clase que contiene los datos de un automóvil así como las distintas funcionalidades
* Como acelerar, desacelerar y frenar. De igual forma muestra los datos del automóvil
***********************************************/

public class Automóvil
{
    // Atributo para conocer el nombre del fabricante del automóvil
    private String marca;
    // Atributo para conocer el año de fabricación
    private int modelo;
    // Atributo para conocer el cilindraje del motor
    private String motor;
    // Atributo para identificar si el automóvil utiliza gasolina, disel o gas natural
    private String tipoCombustible;
    // Atributo para conocer la categoría a la que pertenece
    private String tipoAutomovil;
    // Cantidad de puertas del automóvil
    private char nPuertas;
    // Cantidad de asientos del automóvil
    private char nAsientos;
    // Velocidad máxima en km/h que el automóvil puede alcanzar
    private int velocidadMax;
    // Color del automóvil
    private String color;
    // Velocidad del vehículo en un momento exacto
    private int velocidadActual;   


//**************************************************************

    /*Constructor de la clase Automóvil para inicializar los atributos
    *@param marca define el nombre del fabricante
    *@param modelo define el año de fabricación
    *@param motor define el cilindraje del motor
    *@param tipoCombustible define si utiliza disel, gasolina o gas natural
    *@param tipoAutomovil define la categoría a la que pertenece
    *@param nPuertas define el número de puertas del automóvil
    *@param nAsientos define la cantidad de asientos que tiene el automóvil
    *@param velocidadMax define la velocidad máxima que alcanza el vehículo
    *@paramcolor define el color del vehículo
    *@paramvelocidadActual define la velocidad que tiene el vehículo en un momento exacto
    */
    public Automóvil (String marca, int modelo, String motor, String tipoCombustible,String tipoAutomovil,
            char nPuertas, char nAsientos, int velocidadMax, String color, int velocidadActual  )
    {
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
        this.tipoCombustible=tipoCombustible;
        this.tipoAutomovil=tipoAutomovil;
        this.nPuertas=nPuertas;
        this.nAsientos=nAsientos;
        this.velocidadMax=velocidadMax;
        this.color=color;
        this.velocidadActual=velocidadActual;
    }

    //**************************************************************

    // Método accesor y modificador para el atributo VelocidadActual
    public int getVelocidadMax()
    {
       return velocidadMax;
    } 
    
    public void setVelocidadMax(int velocidadMax)
    {
        this.velocidadMax = velocidadMax;
    }
    
    public int getVelocidadActual()
    {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual)
    {
        this.velocidadActual = velocidadActual;
    }
    
    //**************************************************************
    
    // Método para acelerar a la velocidad que desee el usuario
    // @param aceleracion: Velocidad de aceleración que está tomando el vehículo
    public void acelerar(int aceleracion)
    {
        if ((velocidadActual+aceleracion)>velocidadMax)
        {
            System.out.println("Lo sentimos, la velocidad a la que quieres acelerar sobrepasa la \n capacidad máxima");
        }  // end if
        else
        {
            velocidadActual += aceleracion;
        }  // end else              
    }
    
    //**************************************************************
    
    // Método para desacelerar la velocidad que desee el usuario
    // @param desaceleración: Velocidad que desea desacelerar el usuario
    public void desacelerar(int desaceleracion)
    {
        velocidadActual -= desaceleracion;
    }
    
    //**************************************************************
    
    // Método para frenar el vehículo
    public void frenar()
    {
        velocidadActual = 0;
    }
    
    //**************************************************************
    
    // Método para calcular la estimación del tiempo de llegada del usuario
    // @param distanciaRecorrer: Distancian en kilómetros entre la ubicación actual y el lugar de destino
    public float tiempoEstimadoLlegada (float distanciaRecorrer)
    {
        return ((float)distanciaRecorrer/(float)velocidadActual);
    }
    
    //**************************************************************
    
    // Método que muestra los datos del automóvil
    public void mostrarDatos()
    {
        System.out.println("______________________________________________");
        System.out.println("|  LAS ESPECIFICACIONES DE SU AUTOMÓVIL SON:  |");
        System.out.println("|---------------------------------------------|");
        System.out.println("  - Marca: "+marca);
        System.out.println("  - Modelo: "+modelo);
        System.out.println("  - Motor: "+motor);
        System.out.println("  - Tipo de combustible: "+tipoCombustible);
        System.out.println("  - Tipo de automóvil: "+tipoAutomovil);
        System.out.println("  - Puertas: "+nPuertas);
        System.out.println("  - Asientos: "+nAsientos);
        System.out.println("  - Velocidad máxima: "+velocidadMax+" km/h");
        System.out.println("  - Color: "+color);
        System.out.println("  - Velocidad actual: "+velocidadActual+" km/h");
        System.out.println("______________________________________________");
    }
} //end class Automóvil