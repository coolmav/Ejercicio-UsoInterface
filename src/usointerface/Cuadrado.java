
package usointerface;


public class Cuadrado implements FigurasGeometricas {

    @Override
    public void dimeElCalculorarea(int calculararea) {
       System.out.println("El calculo rarea del cuadrado es: " +calculararea);
    }

    @Override
    public void dimeElCalculorperimetro(int calcularperimetro) {
       System.out.println("El calculo rarea del cuadrado es: " +calcularperimetro); 
    }

    
}
