/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author CRISTIAN
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] v = {"a","b","c", "d", "e"};
        String[] v1 = {"0;","1;","2;","3;","4;"};
        String st = new String();
        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(v);
        arr.add(v1);
        System.out.println(arr.get(0)[0]);
        System.out.println(arr.get(1)[0]);
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        st = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println(st);
        ArrayList<String> resp = new ArrayList<String>();
        for (int j = 0; j < st.length(); j++) {
            System.out.println(st.charAt(j));
            for (int i = 0; i < v.length; i++) {
                char ch = st.charAt(j);
                String aux = new String(new char[]{ch});
                if(aux.equals(v[i])){
                    //System.out.println("Es igual a " + i);
                    resp.add(v1[i]);
                }
            }
   
        }
        
        System.out.println("La respuesta es: " + resp);
        
    }
    
}
