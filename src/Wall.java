public class Wall {
    private int Linea;
    private int Columna;

    public void setLinea(int Linea) {
        this.Linea = Linea;
    }

    public void setColumna(int Columna) {
        this.Columna = Columna;
    }

    public Wall (int Linea, int Columna){
        this.setLinea(Linea);
        this.setColumna(Columna);
    }
}
