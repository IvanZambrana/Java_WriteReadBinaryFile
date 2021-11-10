package ejercicioclase1;

import java.io.*;

/**
 *
 * @author Iván Zambrana Naranjo
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //Creamos objeto tipo File
        File fichero = new File("ejemplo1.dat");
        //Objetos para escritura
        FileOutputStream fileout = new FileOutputStream(fichero);
        DataOutputStream dataOS = new DataOutputStream(fileout);
        
        //Bucle para introducir números del 0 al 100
        for (int i=1; i <= 100; i++)
        {
            dataOS.writeInt(i);
        }
        //Cerramos fichero
        dataOS.close();
        
        //Objetos para lectura
        FileInputStream filein = new FileInputStream(fichero);
        DataInputStream dataIS = new DataInputStream(filein);
        int x;
        
        //Procedimiento de lectura
        try{
            while (true) {
                x = dataIS.readInt();
                System.out.println(x);
                
            }
        } catch(EOFException eo) {}
        //Cerramos el fichero
        dataIS.close();
    }
    
}
