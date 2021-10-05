/**
 * Numeros Unicornio (recursivo).
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio15
{
    public String esNumUnicornio(int n)
    {
        String r;
        if(corazonNumero(n)%3 == 0){
            r = "Numero Unicornio";
        }else{
            r = "Numero Normal";
        }
        return r;
    }
    
    private int corazonNumero(int n){ //dig  0 
        int res;
        if(cantDig(n)%2 == 0){ //verificar si cantDig es par            
            res = digNum(n, cantDig(n)/2, cantDig(n)) * 10 + digNum(n, cantDig(n)/2+1, cantDig(n));
        }else{
            res = digNum(n, cantDig(n)/2+1, cantDig(n));
        }
        return res;
    }
    
    //devuelve el digito de un numero dado la posicion y la cantidad de digitos del numero
    private int digNum(int n, int pos, int cDig){
        int dig;
        if(cDig > pos){
            dig = digNum(n/10, pos+1, cDig);
        }else{
            dig = n%10;
        }
        return dig;
    }
    
    private int cantDig(int n){
        int c;
        if(n > 0){
            c = 1 + cantDig(n/10);
        }else{
            c = 0;
        }
        return c;
    } 
}
