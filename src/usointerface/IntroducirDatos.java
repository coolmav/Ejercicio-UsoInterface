
package usointerface;

import java.util.Scanner;


public class IntroducirDatos {
   
    public static void main(String[] args) {
    
    //Triangulo
        double Base; 
        double Altura;
        double calculararea;
        double calcularperimetro;
    //Rectangulo
        double base;
        double altura;
        double Calculararea;
        double Calcularperimetro;
    //Cuadrado
        double baSe;
        double calcularArea;
        double calcularPerimetro;
        
        Scanner bc=new Scanner(System.in);
    
    //Triangulo    
        System.out.print("Digite la base del triangulo: "); Base=bc.nextDouble();
        System.out.print("Digite la Altura del triangulo: "); Altura=bc.nextDouble();
        System.out.println("\n");
    //Rectangulo   
        System.out.print("Digite la base del rectangulo: "); base=bc.nextDouble();
        System.out.print("Digite la altura del rectangulo: "); altura=bc.nextDouble();
        System.out.println("\n");
    //Rectangulo   
        System.out.print("Digite la base del cuadrado: "); baSe=bc.nextDouble();
        System.out.println("\n");
                        
    //Area y Perimetro del Triangulo
                   calculararea=Base*Altura/2;            
                   calcularperimetro=3*Base;
    //Area y Perimetro del rectangulo
                   Calculararea=base*altura;
                   Calcularperimetro=2*(base+altura);
    //Area y Perimetro del cuadrado
                   calcularArea=baSe*baSe;
                   calcularPerimetro=4*baSe;
            
            System.out.println("\n");
        
        System.out.println("La base del triangulo digitada es: " + Base);
        System.out.println("La altura del triangulo digitada es: " + Altura);
        System.out.println("El calculo area del triangulo es: " + calculararea);
        System.out.println("El calculo perimetro del triangulo es: " + calcularperimetro);
        System.out.println("\n");
        System.out.println("La base del rectangulo digitada es: " + base);
        System.out.println("La altura del rectangulo digitada es: " + altura);
        System.out.println("El calculo area del rectangulo es: " + Calculararea);
        System.out.println("El calculo perimetro del rectangulo es: " + Calcularperimetro);
        System.out.println("\n");
        System.out.println("La base del cuadrado digitada es: " + baSe);
        System.out.println("El calculo area del cuadrado es: " + calcularArea);
        System.out.println("El calculo perimetro del cuadrado es: " + calcularPerimetro);
        System.out.println("\n");
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}