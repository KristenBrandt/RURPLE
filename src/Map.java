
import sun.swing.MenuItemLayoutHelper;

import java.util.List;
import java.util.ArrayList;

public class Map {
    private Robot robot;
    private int height;
    private int width;
    private ArrayList<Wall> WallArrayList;
    private ArrayList<CoinPile> CoinPileArrayList;
    public static final String Move = "MOVE";
    public static final String Rotate = "ROTATE";
    public static final String Pick = "PICK";

    public Map() {
        this.WallArrayList = new ArrayList<>();
        this.CoinPileArrayList = new ArrayList<>();
    }

    public Robot getRobot() {
        return this.robot;
    }

    /** getters and setters **/


    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<CoinPile> getCoinPileArrayList() {
        return CoinPileArrayList;
    }

    /**
     * agregar pared o agregar coinpile a mapa
     **/
    public void agregarpared(Wall wall) {
        this.WallArrayList.add(wall);
    }

    public void agregarcoinpile(CoinPile coinPile) {
        this.CoinPileArrayList.add(coinPile);
    }

//    private boolean RoboCoins() {
        CoinPile coinPile =
    }


    /**
     * leer las instrucciones de un archivo .txt y implementarlas
     **/
  /**  public boolean leerlasinstruc(String instruc) {
        switch (instruc) {
            case Pick:
                if (RoboCoins()) {
                    Robot.monedasplus(1);
                } else {
                    System.out.println("No hay monedas para que RURPLE recoja");
                }
                return false;
            case Move:
                if (RoboMove()) {
                    this.robot.move();
                } else {
                    System.out.println("RURPLE no se puede mover");
                }
                return false;
            case Rotate:
                if (RoboRotate()) {
                    this.robot.rotate();
                    return false;
                }
        }
        return true;
    }
**/
    @Override
    public String toString() {
        String mapaahorita = "";
        for () {
            for (){
                boolean PosiciondePared = PosiciondePared(Linea, Columna);
                boolean PosiciondeRobot = PosiciondeRobot(Linea, Columna);
                CoinPile PosiciondeCoinPile = getPosiciondeCoinPile(Linea, Columna);
                if (PosiciondeCoinPile != null) {
                    mapaahorita += String.valueOf(PosiciondeCoinPile.contarmonedas());
                } else if (PosiciondePared) {
                    mapaahorita += "*";
                } else if (PosiciondeRobot) {
                    mapaahorita += robot;
                } else {
                    mapaahorita += " ";
                }
            }
            mapaahorita += "\n";

        } return mapaahorita;

    }
}

