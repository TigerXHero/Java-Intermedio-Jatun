/**
 * Verificar si 1 numero es primo (recursivo).
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio08
{    
    public String esPrimo(int n)
    {
        String r;
        if(contadorDiv(n, 1) == 1){
             r = "Es un numero Primo";
        }else{
             r = "Es un numero Compuesto";
        }
        return r;
    }
    
    public int contadorDiv(int n, int d){
        int c;
        if(n/2 >= d){
            if(n%d == 0){
                c = 1 + contadorDiv(n, d+1);            
            }else{
                c = contadorDiv(n, d+1);
            }            
        }else{
            c = 0;
        }
        return c;
    }
}