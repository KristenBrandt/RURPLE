import java.util.ArrayList;

public class CoinPile {
    private int Linea;
    private int Columna;
    private int cantidad;


    public void setLinea(int linea) {
        Linea = linea;
    }

    public void setColumna(int columna) {
        Columna = columna;
    }
    public CoinPile(int Linea, int Columna){
        this.setLinea(Linea);
        this.setColumna(Columna);
    }

}
