/**
 * Numeros Narcicistas Recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio14
{
    
    public String esNarcisita(int n)
    {
        String res = "";
        if( sumaPotencias(n, numCifrasNum(n)) ==  n){          
            res = "Narcisista";
        }else{
            res = "Normal";
        }
        return res;
    }
    
    private int numCifrasNum(int n){
        int res;
        if(n > 0){
            res = 1 + numCifrasNum(n/10);
        }else{
            res = 0;
        }
        return res;
    }
    
    private int sumaPotencias(int n, int d){
        int r;
        if(n > 1){
            r = (int)Math.pow(n%10, d) + sumaPotencias(n/10, d);
        }else{
            r = n;
        }
        return r;
    }
}