
package com.mycompany.filtro_java_molina_valentina.view;

import com.mycompany.filtro_java_molina_valentina.model.Ninja;
import java.util.List;
import java.util.Scanner;

public class vista {
    Scanner scanner = new Scanner(System.in);
    
    public void verNinjas(List<Ninja> ninjas){
        System.out.println("ninjas ");
        for(Ninja n: ninjas){
            System.out.println(n);
        }
    } 
}
