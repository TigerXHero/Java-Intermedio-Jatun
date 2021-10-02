/**
 * Division de un numero mediante restas.
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio06
{
    public int restaDeNumeros(int n, int m)
    {
        int res;
        if(m > n){
            res = 0;
        }else{
            res = 1 + restaDeNumeros(n - m , m);
        }
        return res;
    }
}
