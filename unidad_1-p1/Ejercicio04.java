/**
 * Numeros Malvados y Odiosos.
 * 
 * @author (Isaias) 
 * @version (1.0)
 */
public class Ejercicio04
{
    public String numeroMO(int num)
    {
        String res = "";
        int digito = 0;
        int cont = 0;
        if(num == 0){
            res = "Cerito";
        }else{
            while(num > 0){
                digito = num % 10;
                if(digito == 1){
                    cont++;
                }
                num = num / 10;
            }        
            if(cont % 2 == 0){
                res = "Malvado";
            }else{
                res = "Odioso";
            }
        }                
        return res;
    }
    
    public String numeroMORec(int num)
    {
        String res = "";
        if(num == 1){
            res = "Odioso";
        }else{ 
            if(numeroDeUnos(num) % 2 == 0){        
                res = "Malvado";
            }else{
                res = "Odioso";
            }              
        }     
        return res;
    }
    
    private int numeroDeUnos(int num)
    {
        int nDigUno;
        if( num > 0 ){
            if( num % 10 == 1 ){
                nDigUno = 1 + numeroDeUnos(num / 10);              
            }else{
                nDigUno = 0 + numeroDeUnos(num / 10);
            } 
        }else{
            nDigUno = 0;
        }
        return nDigUno;
    }
}
