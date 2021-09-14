/*Alejandro Panduro López
Numero de Control: 19011253
14/09/2021
Simulación*/
package ClasesYObejtos;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Operaciones {
    //Atributos
    int x,y;
    int [] numeros;
    
    //Metodos
public void llenararregloX(int numeros[]){
    for(int i=0;i<numeros.length;i++){
        numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero para X: "));
    }
}
public void llenararregloY(int numeros[]){
    for(int i=0;i<numeros.length;i++){
        numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero para Y:  "));
    }
}
//Xi
public int OperacionX1(int numeros[]){
     int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];  
      }  
  return resultado;
} 
//X^2i
public int OperacionX2(int numeros[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=Math.pow(numeros[i],2);
    }
    return resultado;
}
//Yi
public int OperacionY1(int numeros[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];    
    }
    return resultado;
}
//Xi*Yi
public int OperacionMulti(int numeros[],int numeros2[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=(numeros[i]*numeros2[i]);
    }
    return resultado;
}
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Operaciones op = new Operaciones();
       //Pedir cuantos datos tiene el usuario
       int n= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos datos tiene?"));
       int numerosx[]=new int [n];
       int numerosy[]=new int [n];
       op.llenararregloX(numerosx);
       op.llenararregloY(numerosy);
       
       double xpory=op.OperacionMulti(numerosx, numerosy);
       double x1=op.OperacionX1(numerosx);
       double x2=op.OperacionX2(numerosx);
       double y1=op.OperacionY1(numerosy);
       
       double y =y1/n;
       double x =x1/n;
       
       
       double b1=((n*xpory)-(x1*y1))/((n*x2)-(x1*x1));
       double b0= y-(b1*x);
       System.out.println("Valor de Beta 1: "+b1);
       System.out.println("\nValor de Beta0: "+b0);
      
    }
}


