/**
 * Numeros Perfectos recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio11
{
    public String esPerfecto(int n)
    {
        String res;
        if(sumaDivisores(n, 1) == n){
            res = "Numero Perfecto";
        }else{
            if(sumaDivisores(n, 1) > n){
                res = "Numero Abundante";
            }else{
                res = "Numero Defectivo";
            }
        }
        return res;
    }
    
    public int sumaDivisores(int n, int div){
        int res;
        if(div <= n/2 && n > 2){
            if(n%div == 0){
                res = sumaDivisores(n, div+1) + div;
            }else{
                res = sumaDivisores(n, div+1);
            }            
        }else{
            res = 0;
        }
        return res;
    }
}