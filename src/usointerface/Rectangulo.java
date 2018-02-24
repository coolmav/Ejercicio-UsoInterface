
package usointerface;


public class Rectangulo implements FigurasGeometricas {

    @Override
    public void dimeElCalculorarea(int calculararea) {
        System.out.println("El calculo rarea del rectangulo es: " +calculararea);
    }

    @Override
    public void dimeElCalculorperimetro(int calcularperimetro) {
        System.out.println("El calculo perimetro del rectangulo es: " +calcularperimetro);
    }

    
}
