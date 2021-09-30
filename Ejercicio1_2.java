/**
 * Curva de Hilbert (fractal) recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio1_2
{
    public int lineasCurvaDeHilbert(int n)
    {
        int res;
        if(n > 1){
            if(n%2 == 0){
                res = 3 * lineasCurvaDeHilbert(n - 1) + 4;
            }else{
                res = 3 * lineasCurvaDeHilbert(n - 1);
            }
        }else{
            res = 3;
        }
        return res;
    }
}
