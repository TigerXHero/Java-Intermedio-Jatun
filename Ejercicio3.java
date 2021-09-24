/**
 * Digitos Pares.
 * 
 * @author (Isaias) 
 * @version (1.0)
 */
public class Ejercicio3
{
    public int numeroDeDigitosPares(int num)
    {
        int nDigPar = 0;
        while( num > 0 ){
            if( (num % 10) % 2 == 0 ){
                nDigPar++;
            }
            num = num / 10;
        }
        return nDigPar;
    }
    
    public int numeroDeDigitosParesRec(int num)
    {
        int nDigPar;
        if( num > 0 ){
            if( (num % 10) % 2 == 0 ){
                nDigPar = 1 + numeroDeDigitosParesRec(num / 10);              
            }else{
                nDigPar = 0 + numeroDeDigitosParesRec(num / 10);
            } 
        }else{
            nDigPar = 0;
        }
        return nDigPar;
    }
    
    public int numeroDeDigitosParesRecCero(int num)
    {
        int nDigPar;
        if( num >= 0 ){
            if( (num % 10) % 2 == 0 ){
                nDigPar = 1 + numeroDeDigitosParesRec(num / 10);              
            }else{
                nDigPar = 0 + numeroDeDigitosParesRec(num / 10);
            } 
        }else{
            nDigPar = 1;
        }
        return nDigPar;
    }
}
