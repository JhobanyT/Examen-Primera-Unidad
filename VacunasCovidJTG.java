import java.util.Scanner;

class VacunasCovidJTG{
static Scanner teclado=new Scanner(System.in);
//algoritmo para vacunas contra en covid segun edad y sexo
//creado por Jhobany Ticona 21/05/2020
public static void main(String[] args){
  String tipoVacuna;
  int edad,sexo;
  sexo=0;
  //datos de entrada
  System.out.println("Ingrese la edad de la persona");
  edad=teclado.nextInt();
  System.out.println("Ingrese el sexo de a persona 1(SI ES VARON) Y 2 (SI ES MUJER)");
  sexo=teclado.nextInt();
  //proceso
  
  if(edad>70){
    tipoVacuna="aplicar vacuna tipo C";
  }else if(edad>=16 && edad<=69){
    if(sexo==1){
      tipoVacuna="aplicar vacuna tipo A";
    }else {
      tipoVacuna="aplicar vacuna tipo B";
    }
  }else{
    tipoVacuna="aplicar vacuna tipo A";
  }
  //datos de salida
  System.out.println("La Vacuna a utilizar es: " + tipoVacuna);
}
}