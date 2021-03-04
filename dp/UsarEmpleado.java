/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author USUARIO
 */
public class UsarEmpleado {
    
    public static void main(String[] args){
        Empleado empl= new Empleado(1, "Sistemas", 45000.0f , 15);
        empl.setNombre("Juan José");
        empl.setApPaterno("García");
        empl.setApMaterno("Bolaños");
        empl.setCurp("GABJ121212HDFTR2");

        System.out.println( "info:" + empl );

    }
}