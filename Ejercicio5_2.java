/**
 * Cruz de Viseck (fractal).
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio5_2
{
    
    public int cruzViseck(int n)
    {
        int res;
        if(n > 1){
            res = (cruzViseck(n - 1)*5 - 8);
        }else{
            res = 4;
        }
        return res;
    }
}
