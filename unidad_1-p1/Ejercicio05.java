/**
 * Multiplicacion por sumas (recursivo).
 * 
 * @author Isaias
 * @version (a version number or a date)
 */
public class Ejercicio05
{   
    public int multiplicarN(int n, int m)
    {
        int mul;
        if(n == 0 || m == 0){
                mul = 0;
        }else{
            if(m > 1){
                mul = n + multiplicarN(n, m-1);
            }else{            
                mul = n;
            }
        }        
        return mul;
    }
}