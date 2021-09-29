/**
 * Invertir un numero usando recursividad.
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio9
{
    public int invertirNum(int n)
    {
        int res;
        //int dig;
        int aux;
        if(n >= 10){
            //dig = n % 10;
            aux = (n % 10) * 10;
            res = aux + (invertirNum(n / 10))%10 ;
            
            //invertirN(n / 100);
        }else{
            res = n;            
        }
        return res;
    }
    
    public int invertirNumero(int n)
    {
        int res = 0;
        int dig;
        int dig2;
        if(n < 10){
            res = n;
        }else{
            while(n > 10){        
                dig = n % 10;
                dig2 = (n/10)%10;
                nuevoNum(dig, dig2);
            }  
        }           
        return res;
    }
    
    private int nuevoNum(int dig, int dig2){        
        int num = 0;
        num = dig * 10 + dig2;
        return num;
    }
    
}
