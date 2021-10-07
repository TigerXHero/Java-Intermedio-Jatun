public class Cuadro{
    private int valor;
    private boolean develado;
    public Cuadro(){
        valor = 0;
        develado = false;
    }
    public int getValor(){
        return valor;
    }
    public void setMina(){
        valor = -1;
    }
    public void incrementar(){
        valor++;
    }
    public void develar(){
        develado = true;
    }
    public boolean estaDevelado(){
        return develado;
    }
}