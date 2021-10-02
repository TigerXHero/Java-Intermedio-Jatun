/**
 * Estrella pentagrama fractal recursivo.
 * 
 * @author Isaias   
 * @version 1.0
 */
public class Ejercicio7_2
{
    public int estrellaFractal(int n)
    {
        int res;
        if(n > 1){
            res = estrellaFractal(n - 1) + 5 * (int)Math.pow(4, n-2);
        }else{
            res = 1;
        }
        return res;
    }
}
