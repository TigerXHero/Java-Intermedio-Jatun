/**
 * Curva de Kcoth (fractal) recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio2_2
{
    public int triangulosPunta(int n)
    {
        int res;
        if(n > 1){
            res = triangulosPunta(n - 1) + (int)Math.pow(4, n-1);
        }else{
            res = 1;
        }
        return res;
    }
}
