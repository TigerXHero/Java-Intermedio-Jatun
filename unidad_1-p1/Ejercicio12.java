/**
 * Numeros amigos recursivo.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio12
{ 
    public String sonAmigos(int n, int m)
    {
        String r;
        if(sumaDivisores(n, 1) == m && sumaDivisores(m, 1) == n){
            r = "Son amigos";
        }else{
            r = "NO son amigos";
        }
        return r;
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