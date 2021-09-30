/**
 * Arbol de ramas fractales.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio6_2
{  
    public int arbolFractal(int n)
    {
        int res;
        if(n > 1){
            res = (int)Math.pow(2, n-1) + arbolFractal(n-1);
        }else{
            res = 1;
        }
        return res;
    }
}
