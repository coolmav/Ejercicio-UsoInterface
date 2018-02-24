
package usointerface;


public class Triangulo implements FigurasGeometricas {

    @Override
    public void dimeElCalculorarea(int calculararea) {
        System.out.println("El calculo rarea del triangulo es: " +calculararea);
    }

    @Override
    public void dimeElCalculorperimetro(int calcularperimetro) {
        System.out.println("El calculo perimetro del triangulo es: " +calcularperimetro);
    }

    
}
