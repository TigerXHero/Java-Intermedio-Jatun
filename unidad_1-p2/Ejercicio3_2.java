/**
 * Alfombra de Sierpinski (fractal) recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio3_2
{
    public int cuadradosBlancos(int n)
    {
        int res;
        if(n > 1){
            res = cuadradosBlancos(n - 1) * 8 + 1;
        }else{
            res = 1;
        }
        return res;
    }
}
