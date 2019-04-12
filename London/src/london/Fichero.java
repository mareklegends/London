/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package london;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Fichero {

    public static ArrayList<String> agregarVipsLista() {
        ArrayList<String>vLista = new ArrayList();
        File f = null;
         FileReader fr = null;
        BufferedReader br = null;
        f = new File("listadiscoteca.txt");
        if (f.exists()) {
            try {
                fr = new FileReader (f);
                br = new BufferedReader(fr);
                
                String linea;
		while((linea=br.readLine())!=null){
                  vLista.add(linea);
                }
				
                
            } catch (FileNotFoundException ex) {
                System.out.println("");
            } catch (IOException ex) {
                System.out.println("");
            }
	  
        }
        
        return vLista;
    }
    
   
}
