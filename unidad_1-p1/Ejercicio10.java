/**
 * Convertir N a binario (recursivo).
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio10
{
    public int convertirABinario(int n)
    {      
        int c = contDig(invertirNum(binarioInv(n)));
        int d = cantDiv(n);
        if(c != d){
            return (invertirNum(binarioInv(n)) * (int)Math.pow(10, d-c));
        }else{
            return invertirNum(binarioInv(n));
        }        
    }
    
    public int binarioInv(int n){
        int r;
        if(n/2 > 0){
            r = n%2 * (int)Math.pow(10, cantDiv(n)-1) + binarioInv(n/2);
        }else{
            r = 1;
        }
        return r;
    }
    
    public int cantDiv(int n){
        int r;
        if(n/2 > 0){
            r = 1 + cantDiv(n/2);
        }else{
            r = 1;
        }
        return r;
    }
    
    public int invertirNum(int n)
    {
        int res;  
        if(contDig(n) > 0){ 
            res = (n%10) * (int)Math.pow(10, contDig(n)-1) + invertirNum(n / 10);
        }else{
            res = n;            
        }
        return res;
    }
    
    private int contDig(int n){
        int c;
        if(n > 0){
            c = 1 + contDig(n/10);
        }else{
            c = 0;
        }
        return c;
    } 
}