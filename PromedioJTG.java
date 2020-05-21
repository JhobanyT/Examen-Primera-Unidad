import java.util.Scanner;

class PromedioJTG{
//algoritmo para Calcular el promedio
//creado por Jhobany Ticona 
public static void main(String[] args) {
  double p1,p2,p3,p4,nota1,nota2,nota3,nota4 ;
  double R1,R2,R3,R4,PT,PromedioFinal;
  //datos de entrada
 p1=0.15;nota1=20;
 p2=0.2;nota2=14;
 p3=0.25;nota3=13;
 p4=0.4;nota4=10;
 PT=1;
//proceso
 R1=p1*nota1;
 R2=p2*nota2;
 R3=p3*nota3;
 R4=p4*nota4;
 PromedioFinal=R1+R2+R3+R4;
//DATOS DE SALIDA
  System.out.println("El promedio es: " + PromedioFinal);
}

}