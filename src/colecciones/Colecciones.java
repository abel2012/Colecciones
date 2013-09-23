/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import com.fpmislata.Colecciones.Datos.Coche;
import com.fpmislata.Colecciones.Datos.Marca;
import com.fpmislata.Colecciones.Datos.Persona;
import com.fpmislata.Colecciones.Datos.Sexo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Persona persona1 = new Persona("53752654R","Abel","Pérez",Sexo.HOMBRE);
        Coche coche1 = new Coche(Marca.FORD, "MONDEO", 200);
        Coche coche2 = new Coche(Marca.FORD, "Fiesta", 237);
        Coche coche3 = new Coche(Marca.CITROEN, "Xantia", 324);
        Coche coche4 = new Coche(Marca.RENAULT, "21", 123);
        Coche coche5 = new Coche(Marca.SEAT, "Ibiza", 160);
        
        coche1.setPropietario(persona1);
        coche2.setPropietario(persona1);
       List<Coche> coches=persona1.getCoches();
       coches.add(coche1);
       coches.add(coche2);
                
        



        Coche cocheBuscado = mapCoches.get("45678923I");
        System.out.println(cocheBuscado.getMarca());


    }
}
