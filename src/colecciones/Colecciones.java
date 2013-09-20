/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import com.fpmislata.Colecciones.Datos.Coche;
import com.fpmislata.Colecciones.Datos.Marca;
import java.util.HashMap;
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
        
        Map<String,Coche> mapCoches=new HashMap<>();
        Coche coche1= new Coche(Marca.FORD,"MONDEO",200,"53752456Y");
        Coche coche2= new Coche(Marca.FORD,"Fiesta",237,"45678923I");
        Coche coche3= new Coche(Marca.CITROEN,"Xantia",324,"23456712D");
        Coche coche4= new Coche(Marca.RENAULT,"21",123,"21456723D");
        Coche coche5= new Coche(Marca.SEAT,"Ibiza",160,"45678923T");
    }
}
