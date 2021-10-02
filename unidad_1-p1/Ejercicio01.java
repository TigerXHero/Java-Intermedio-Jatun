
/**
 * Contador de digito naturales recursivo.
 * 
 * @author Isaias
 * @version 1.0
 */
public class Ejercicio01
{
    public int contarDigitosRec(int numero)
    {        
        int contador;
        if(numero > 0){
            numero = numero / 10;
            contador = 1 + contarDigitosRec(numero);
        } else{
            contador = 0;
        }
        return contador;
    }
}
