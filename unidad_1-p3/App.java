import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Juego juego1 = new Juego(6,6,10);
        juego1.prepararTablero();
        System.out.println("Buscaminas Tablero 6x6 :) ");
        juego1.imprimir();
        while(juego1.estaEnCurso()){
            System.out.print("Ingrese coordenada x: ");
            int i = sc.nextInt();
            System.out.print("Ingrese coordenada y: ");
            int j = sc.nextInt();
            juego1.jugar(i,j);
        }
    }
}