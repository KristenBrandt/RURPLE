public class Robot {
    private int linea;
    private int columna;
    private int [] where = new int[2];
    private int direccion;
    private int cantmonedas;
    private static final int Up = 0;// ^
    private static final int Right = 1;// >
    private static final int Down = 2;// V
    private static final int Left = 3;// <

/** lo que tiene el robot- direccion, posicion(where), monedas **/
    public Robot(int direccion, int linea,int columna){
        this.direccion = direccion;
        this.where[0] = linea;
        this.where[1] = columna;
        this.cantmonedas = 0;
    }

/** getters and setters **/
    public void setLinea(int linea) {
        this.where[0] = linea;
    }

    public void setColumna(int columna) {
        this.where[1] = columna;
    }

    public int [] getWhere(){
        return this.where;
    }

    public int getLinea(){
        return this.where[0];
    }

    public int getColumna(){
        return this.where[1];
    }

    public int getCantmonedas() {
        return cantmonedas;
    }

/** ver en que direccion esta el robot actualmente **/
    public int getDireccion() {
        return direccion;
    }

/** hacer que robot cambie de direccion **/
    public void ChangeDireccion() {
        switch (this.direccion){
            case 0:
                this.direccion = 1;
                break;
            case 1:
                this.direccion = 2;
                break;
            case 2:
                this.direccion =3;
                break;
            case 3:
                this.direccion = 0;
                break;
        }
    }
/** hacer que robot se mueva **/
    public void move(){
        switch (this.direccion){
            case Up: setLinea(getLinea()-1 );// se mueve una linea para arriba (negativo)
            break;
            case Right: setColumna(getColumna()+1); // se mueve una columna a la derecha (positivo)
            break;
            case Down: setLinea(getLinea()+1); // se mueve una linea para abajo (positivo)
            break;
            case Left: setColumna(getColumna()-1); //se mueve una columna a la izquierda (negativo)
            break;
        }
    }
/** hacer que el robot agarre monedas**/
    public void monedasplus(int moneda) {
        this.cantmonedas += moneda;
    }

/** make numbers into string to print in the updated map **/
    @Override
    public String toString(){
        switch (this.direccion){
            case Up : return "ˆ";
            case Right: return ">";
            case Down: return "V";
            case Left: return "<";
        }
        return "";
    }
}
