/**
 * Triangulo de Sierpinski fractal.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio4_2
{
    
    public int trianguloSier(int r)
    {
        int res;
        if(r > 1){
            res = trianguloSier(r - 1) * 3 + 2;
        }else{
            res = 1;
        }
        return res;
    }
}
