/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import com.fpmislata.Colecciones.Datos.Coche;
import com.fpmislata.Colecciones.Datos.Marca;
import com.fpmislata.Colecciones.Datos.Persona;
import com.fpmislata.Colecciones.Datos.Sexo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, Coche> mapCoches = new HashMap<>();
        Persona persona1 = new Persona("53752654R", "Abel", "Pérez", Sexo.HOMBRE);
        Coche coche1 = new Coche(Marca.FORD, "MONDEO", 200, "53752654A");
        Coche coche2 = new Coche(Marca.FORD, "Fiesta", 237, "12345678Z");
        Coche coche3 = new Coche(Marca.CITROEN, "Xantia", 324, "22365578R");
        Coche coche4 = new Coche(Marca.RENAULT, "21", 123, "21456723U");
        Coche coche5 = new Coche(Marca.SEAT, "Ibiza", 160, "24357623J");

        coche1.setPropietario(persona1);
        coche2.setPropietario(persona1);
        List<Coche> coches = persona1.getCoches();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);

        Coche mostrar = coches.get(1);

        List<Coche> coches2 = new ArrayList<Coche>();
        coches2.add(coche1);
        coches2.add(coche2);
        coches2.add(coche3);
        coches2.add(coche4);
        coches2.add(coche5);
        
        for (Coche nombre: coches){
  System.out.println(nombre.getModelo());
  System.out.println(nombre.getMarca());
        }

        /*
        for (int i = 0; i < coches2.size(); i++) {

            System.out.println(coches2.get(i));
            System.out.println(mostrar.getDni());
            System.out.println(mostrar.getMarca());
            System.out.println(mostrar.getModelo());
            System.out.println(mostrar.getCilindrada());

        }

*/
   
            
            
        Coche cocheBuscado = coches.get(1);
        System.out.println(cocheBuscado.getPropietario().getNombreCompleto());
        System.out.println(cocheBuscado.getDni());
        System.out.println(cocheBuscado.getMarca());
        System.out.println(cocheBuscado.getModelo());
        System.out.println(cocheBuscado.getCilindrada());

        /*
         mapCoches.put(coche1.getPropietario().getDni(), coche1);
         mapCoches.put(coche2.getPropietario().getDni(), coche2);
         mapCoches.put(coche3.getPropietario().getDni(), coche3);
         mapCoches.put(coche4.getPropietario().getDni(), coche4);
         mapCoches.put(coche5.getPropietario().getDni(), coche5);
         */

    }
}
