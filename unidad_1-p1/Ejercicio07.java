/**
 * Numeros Crecientes e Hibridos.
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio07
{
    public String esCreciente(int n){
        String res = "";
        int dig;
        if(n > 0){            
            dig = n % 10;
            if((n / 10) % 10 > dig){
                esCreciente(n / 10);
                res = "Creciente";
            }else{
                res = "Hibrido";
            }
        }
        return res;
    }
}
