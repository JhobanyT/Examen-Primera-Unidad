import java.util.Scanner;

class OperacionAritmeticaJTG{
static Scanner teclado=new Scanner(System.in);
//algoritmo para operaciones aritmeticas: Suma, Resta, Multiplicacion, Division, Potenciacion
//creado por Jhobany Ticona 21/05/2020
public static void main(String[] args){
  double PrimerNumero,SegundoNumero,resultado;
  char operacion;
  //datos de entrada
  System.out.println("Ingrese el Primer Numero");
  PrimerNumero=teclado.nextDouble();
  System.out.println("Ingrese el Segundo Numero");
  SegundoNumero=teclado.nextDouble();
  System.out.println("Elija la opcion que desea hacer:");
  System.out.println("+ : si es suma");
  System.out.println("- : si es resta");
  System.out.println("* : si es multiplicacion");
  System.out.println("/ : si es division");
  System.out.println("^ : si es potencia");
  operacion=teclado.next().charAt(0);
  resultado = 0;
  //proceso
  if(operacion=='+'){
    resultado = PrimerNumero + SegundoNumero;
  }else if(operacion=='-'){
    resultado = PrimerNumero - SegundoNumero;
  }
  if(operacion=='*'){
    resultado = PrimerNumero * SegundoNumero;
  }else if(operacion=='/'){
    resultado = PrimerNumero / SegundoNumero;
  }
  if(operacion=='^'){
    resultado = Math.pow (PrimerNumero, SegundoNumero);
  }
  //DATOS DE SALIDA
  System.out.println("El resultado es: " + resultado );
}
}