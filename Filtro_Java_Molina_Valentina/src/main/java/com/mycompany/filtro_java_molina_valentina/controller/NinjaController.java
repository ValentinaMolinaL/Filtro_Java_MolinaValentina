/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtro_java_molina_valentina.controller;

import com.mycompany.filtro_java_molina_valentina.model.Consult;
import com.mycompany.filtro_java_molina_valentina.model.Ninja;
import com.mycompany.filtro_java_molina_valentina.view.vista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class NinjaController {

    boolean opcion = true;

    Consult ninjaCon;
    Ninja ninja;
    vista vistas;

    public NinjaController(Consult ninjaCon, vista vistas) {
            Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Mostrar Ninjas con habilidades");
            System.out.println("2. Mostrar las misiones disponibles para un ninja específico");
            System.out.println("3. Mostrar las misiones completadas para un ninja específico");
            System.out.println("4. Asignar una misión a un ninja, registrando la fecha de inicio");
            System.out.println("5. Marcar una misión como completada, registrando la fecha de finalización");
            System.out.println("6. Mostrar todas las misiones completadas ");
            int opc = scanner.nextInt();
                    
             switch(opc){
                 case 1: 
                    List<String>listaNInja=new ArrayList<>();
                    listaNInja=ninjaCon.ninjaHabilidad(ninja);
                     for(String listas : listaNInja){
                         System.out.println(listas);
                     }
                    
             }   
                    

        }
        

    }
}
