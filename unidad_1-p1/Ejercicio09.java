/**
 * Invertir un numero usando recursividad.
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio09
{
    public int invertirNum(int n)
    {
        int res;  
        if(contDig(n) > 0){ 
            res = (n%10) * (int)Math.pow(10, contDig(n)-1) + invertirNum(n / 10);
        }else{
            res = n;            
        }
        return res;
    }
    
    private int contDig(int n){
        int c;
        if(n > 0){
            c = 1 + contDig(n/10);
        }else{
            c = 0;
        }
        return c;
    } 
}
