/** CREO QUE YA ESTA **/

public class CoinPile {
    private int [] Where = new int [2];
    private int Linea;
    private int Columna;
    private int cantidad;
    private static final int Maximo = 9;
    private static final int Minimo = 0;

/** getters and setters **/
    public int getCantidad(){
        return cantidad;
    }

    public int getColumna(){
        return this.Where[1];
    }

    public int getLinea(){
        return this.Where[0];
    }

/** agarrar una moneda del pile **/
    private boolean agarrarblingbling(){
        while (cantidad !=Minimo){
            cantidad = cantidad-1;
        }
        return (false);
    }
/** revisar si un coin pile tiene mas de 9 monedas **/
    private boolean revisar(){
        if (cantidad > Maximo){
            return false;
        }
        return true;
    }
/** un CoinPille tiene un where(posicion), y una cantidad de monedas definida **/
    public CoinPile(int Linea, int Columna, int cantidad){
        this.Where[0]= Linea;
        this.Where[1]= Columna;
        this.cantidad = cantidad;
    }

}
