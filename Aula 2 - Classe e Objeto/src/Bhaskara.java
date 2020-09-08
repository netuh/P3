// Importa a Extenção Swing
import java.util.Scanner;
 
 public class Bhaskara {
    //Inicializaçao das variaveis
    public static void main ( String args [] )
    {
        double numberA,
        numberB,
        numberC,
        delta,
        x1,
        x2;
        Scanner s = new Scanner (System.in);
 
        System.out.println("valor A");
        numberA = s.nextInt();
        System.out.println("valor B");
        numberB = s.nextInt();
        System.out.println("valor C");
        numberC = s.nextInt();
         
        // Faz os calculos necessarios
         
        delta = (numberB*numberB)-4*(numberA)*(numberC);
         
        x1 = -numberB + Math.sqrt(delta) / 2*numberA;
        x2 = -numberB - Math.sqrt(delta) / 2*numberA;
         
        // Mostra os Resultados obtidos
         
        System.out.println("O x1 da questão será " + x1);
         
        System.out.println("O x2 da questão será " + x2);
    }
 }