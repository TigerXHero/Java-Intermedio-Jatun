public class Juego{
    private Cuadro[][] tablero;
    private int cantMinas;
    private boolean enCurso;
    private int filas;
    private int columnas;
    private int cuadrosDevelados;
    public Juego(int m, int n, int numMinas){
        tablero = new Cuadro[m][n];
        filas = m;
        columnas = n;
        cantMinas = numMinas;
        enCurso = false;
        cuadrosDevelados = 0;
    }
    public boolean estaEnCurso(){
        return enCurso;
    }
    public void prepararTablero(){
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                tablero[i][j] = new Cuadro();
            }
        }
        for(int i=0; i<cantMinas; i++){
            colocarMina();
        }
        enCurso = true;
    }

    private void colocarMina(){
        boolean colocado = false;
        while(colocado == false){
            int i = (int) (Math.random()*filas);
            int j = (int) (Math.random()*columnas);
            if(tablero[i][j].getValor() >= 0){
                tablero[i][j].setMina(); 
                incrementar(i-1, j-1);
                incrementar(i-1, j);
                incrementar(i-1, j+1);
                incrementar(i, j-1);
                incrementar(i, j+1);
                incrementar(i+1, j-1);
                incrementar(i+1, j);
                incrementar(i+1, j+1);
                colocado = true;
            }
        }
    }

    private void incrementar(int i, int j){
        if(esValido(i,j) && tablero[i][j].getValor() >= 0){
            tablero[i][j].incrementar();
        }
    }

    private boolean esValido(int i, int j){
        return i>=0 && i<filas && j>=0 && j<columnas;
    }

    public void develarMinas(){                
        for(int x=0; x<filas; x++){
            for(int y=0; y<columnas; y++){ 
                if(tablero[x][y].getValor() < 0){
                    tablero[x][y].develar();
                }                
            }            
        } 
    }
    
    public void jugar(int i, int j){
        if(enCurso){
            if(esValido(i,j)){
                if(!tablero[i][j].estaDevelado()){
                    tablero[i][j].develar();
                    cuadrosDevelados++;
                    verificarFinDeJuego();
                    int valor = tablero[i][j].getValor();
                    if(valor>0){
                        System.out.println("Cuadro develado, continua jugando");
                    }else{
                        if(valor<0){
                            System.out.println("Activaste una mina, perdiste el juego");
                            develarMinas();                           
                            enCurso = false;
                        }else{
                            develar(i-1, j-1);
                            develar(i-1, j);
                            develar(i-1, j+1);
                            develar(i, j-1);
                            develar(i, j+1);
                            develar(i+1, j-1);
                            develar(i+1, j);
                            develar(i+1, j+1);
                            System.out.println("Cuadros develados, continua jugando");
                        }
                    }
                }
            }
        }else{
            System.out.println("El juego ya no esta en curso");
        }
        imprimir();
        System.out.println("=========================");
    }
    private void verificarFinDeJuego(){
        if((filas*columnas)-cantMinas == cuadrosDevelados){
            enCurso = false;
            System.out.println("Ganaste El juego!!! Felicidades");
            imprimir();
        }
    }
    private void develar(int i, int j){
        if(esValido(i,j)){
            if(tablero[i][j].getValor() >= 0 && !tablero[i][j].estaDevelado()){
                tablero[i][j].develar();
                cuadrosDevelados++;
                int valor = tablero[i][j].getValor();
                if(valor==0){
                    develar(i-1, j-1);
                    develar(i-1, j);
                    develar(i-1, j+1);
                    develar(i, j-1);
                    develar(i, j+1);
                    develar(i+1, j-1);
                    develar(i+1, j);
                    develar(i+1, j+1);
                }
            }
        }
    }

    public void imprimir(){
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                if(tablero[i][j].estaDevelado()){
                    int valor = tablero[i][j].getValor();
                    if(valor>=0){
                        System.out.print(" "+valor+" ");
                    }else{
                        System.out.print(" * ");
                    }
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
