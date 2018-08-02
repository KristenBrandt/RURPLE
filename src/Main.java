import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Map mimapa = new Map();
        String [][] map;

/** Variables **/
    String mapita;
    String instruc;

/** Pedir que ingrese la dirección del mapa **/
    System.out.println("Ingrese el nombre del archivo de mapa a ejecutar (tiene que terminar en .txt):");
    mapita = scan.nextLine();
    ArrayList<String> cosa = new ArrayList<String>();

/** para leer el archivo de mapa **/
    try {
        Stream<String> lines = Files.lines(
                Paths.get("/Users/kristen/Desktop/RURPLE/"+mapita),
                StandardCharsets.UTF_8

        );
        lines.forEach(s -> cosa.add(s));

    } catch (IOException exception){
        System.out.println("Error!");
    }

/** pedir que ingrese direccion de las instrucciones **/
        System.out.println("Ingrese el nombre del archivo de instrucciones a ejecutar (tiene que terminar en.txt):");
        instruc = scan.nextLine();
        ArrayList<String> instrucion = new ArrayList<String>();

/** para leer el archivo con las instrucciones **/
    try {Stream<String> lines = Files.lines(
            Paths.get("/Users/kristen/Desktop/RURPLE/"+instruc),
            StandardCharsets.UTF_8
    );
        lines.forEach(s -> instrucion.add(s));
    } catch (IOException exception){
        System.out.println("Error!");
    }

/** imprimir mapa **/
    System.out.println("Mapa cargado:");
    cosa.forEach(a -> System.out.println(a));
    System.out.println("Ejecutando:");

    for (int b =0;b<instrucion.size();b++){
        if (instrucion.get(b).equals("MOVE")){


        }

    }
    try {
        Thread.sleep(500);
    }catch (Exception e){
        System.out.println("Error a la hora de poner el timer!");
    }


    }

}
