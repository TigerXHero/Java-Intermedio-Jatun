/**
 * Factorial de un numero (recursivo).
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio02
{    
    public int factorialDeN(int num)
    {
        int fact;
        if( num > 0 ){
            fact = num * factorialDeN( num - 1 );
        } else{
            fact = 1;
        }
        return fact;
    }
}