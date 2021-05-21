package matricula_v1;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {

        File file = new File("matricula_v1/matriculas.txt");
        if(!file.exists()){
            System.out.println("El fichero no existe");
            return;
        }

        TreeSet<String> tMatriculas = new TreeSet<>();
        ArrayList<String> aErroneas = new ArrayList<>();

        try{
            Scanner fScanner = new Scanner(file);
            String linea;
            boolean correcta;

            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                correcta = true;
                // numeros
                for(int i = 0; i < 4; i++){
                    if(linea.charAt(i) < '0' || linea.charAt(i) > '9'){
                        correcta = false;
                    }
                }
                // letras
                for(int i = 4; i < linea.length(); i++){
                    if(linea.charAt(i) >= '0' && linea.charAt(i) <= '9'){
                        correcta = false;
                    }
                    if(linea.charAt(i) == 'A' || linea.charAt(i) == 'E' || linea.charAt(i) == 'I' || linea.charAt(i) == 'O' || linea.charAt(i) == 'U'
                    || linea.charAt(i) == ' '){
                        correcta = false;
                    }
                }
                if(correcta){
                    tMatriculas.add(linea);
                }
                else{
                    aErroneas.add(linea);
                }
            }
            fScanner.close();

            BufferedWriter bwCorrectas = new BufferedWriter(new FileWriter(file));
            for(String mat : tMatriculas){
                bwCorrectas.write(mat + "\r\n");
            }
            bwCorrectas.close();

            BufferedWriter bwErroneas = new BufferedWriter(new FileWriter("matricula_v1/matriculas_erroneas.txt"));
            for(String err : aErroneas){
                bwErroneas.write(err + "\r\n");
            }
            bwErroneas.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Error de fichero");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Error al excribir fichero");
            e.printStackTrace();
        }
        
    }
}