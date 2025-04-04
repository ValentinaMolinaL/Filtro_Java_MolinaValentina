
package com.mycompany.filtro_java_molina_valentina.model;

import static com.mycompany.filtro_java_molina_valentina.DatabaseConfig.config.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Consult {
    
    public List<String> ninjaHabilidad (Ninja ninja){
        String sql= " select n.*, h.nombre_Habilidad from Ninja n inner join Habilidad h on n.id_Ninja=h.id_Ninja ";
        List<String> listarNH = new ArrayList<>();
        try {
            Connection connection  = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                listarNH.add("id_Ninja: " + resultado.getInt("id_Ninja")
                + "nombre: " + resultado.getString("nombre")
                + "rango: " + resultado.getString("rango")
                + "aldea: " + resultado.getString("aldea")
                + "nombre_Habilidad: " + resultado.getString("nombre_Habilidad"));
                        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listarNH;
    }
    
}
