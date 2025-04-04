
package com.mycompany.filtro_java_molina_valentina;

import com.mycompany.filtro_java_molina_valentina.controller.NinjaController;
import com.mycompany.filtro_java_molina_valentina.model.Consult;
import com.mycompany.filtro_java_molina_valentina.view.vista;

public class Filtro_Java_Molina_Valentina {

    public static void main(String[] args) {
        Consult consultas = new Consult();
        vista vistas = new vista();
        NinjaController controlador =new NinjaController(consultas,vistas);
        
    }
}
