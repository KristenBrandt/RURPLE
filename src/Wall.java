public class Wall {
    private int Linea;
    private int Columna;
    private int [] where = new int [2];


    public void setLinea(int Linea) {
        this.Linea = Linea;
    }

    public void setColumna(int Columna) {
        this.Columna = Columna;
    }
/** un wall tiene un where (posicion) **/
    public Wall (int Linea, int Columna){
        this.where[0] = Linea;
        this.where[1] = Columna;

    }
/** setters y getters **/
    public int getLinea() {
        return this.where[0];
    }

    public int getColumna() {
        return this.where[1];
    }

    public int[] getWhere() {
        return this.where;
    }
    @Override
    public String toString(){
        return "*";
    }
}
