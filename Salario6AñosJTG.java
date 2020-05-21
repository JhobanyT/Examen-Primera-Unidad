import java.util.Scanner;
//algoritmo para salario dentro de 6 años con 10% de incremento
//creado por JHOBANY TICONA GONZALO 19/05/20
 class Salario6AñosJTG {
//PROCESOS Y SALIDAS 
    public static void main(String[] args) {
        int Incremento;
        double Salario_Inicial, Salario_Recibido, anio;
        for (Incremento=0; Incremento<=6; Incremento++) {
            System.out.println("PROCESO" + Incremento);
            Salario_Inicial=1400;
            anio=Incremento;
            Salario_Recibido=Salario_Inicial*Math.pow(1.1,anio);
            System.out.println("Salario inicial: " + Salario_Inicial);
            System.out.println("El salario recibido durante este año es: " + Salario_Recibido);
            System.out.println("El año: " + anio);
            System.out.println("Espero le haya servido de mucha ayuda GRACIAS");
        }
    }
}