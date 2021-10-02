/**
 * Numeros Novios.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio13
{
    
    public String sonNumerosNovios(int n, int m)
    {
        String res = "";
        int a = (sumaDivisoresNum(n, 1))-1;
        int b = (sumaDivisoresNum(m, 1))-1;
        if( a == m && b == n ){
            res = "Son Novios";
        }else{
            res = "No Pasa Nada";
        }
        return res;
    }
    
    private int sumaDivisoresNum(int num, int i){
        int res;
        if(i <= num/2){
            if(num%i == 0){
                res = i + sumaDivisoresNum(num, i+1);
            }else{
                res = sumaDivisoresNum(num, i+1);
            }
        }else{
            res = 0;
        }
        return res;
    }
}
