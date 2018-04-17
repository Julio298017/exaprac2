
package julioalvarado;

import javax.swing.JOptionPane;

/**
 * Fecha: 17/04/2018
 * Version: 1
 * Clase: Examen practico 2
 * Autor: Julio ALvarado
 * Copyright: ITCA Fepade 2018
 */
public class JulioAlvarado {

   
    public static void main(String[] args) {
        
        boolean bandera = true;
        int N;
        String nombre;
        double planilla = 0;
        int horas;
        int option = 0;
        int i;
        int contador = 0;
                
        N = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese la cantidad de empleados a registrar"));
        
        
        String nombres [] = new String [N];
        double salarios [] = new double [N];
        double salarioxhora [] = new double [N];
        int horasL [] = new int [N];
        double salarioCR [] = new double [N];
        double renta [] = new double [N];
        
        
        
        do 
        {
            
            option = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione la opcion de la siguiente forma: \n"
                    + "1 = Agregar registros. \n2 = Ver registros. \n3 = Salir del programa."));
            
            if(option==1)
            {
                for(i=0; i<N; i++)
                {
                nombres [i] = JOptionPane.showInputDialog("Favor ingrese el nombre del empleado");
                salarios [i] = Double.parseDouble(JOptionPane.showInputDialog("Favor ingrese el salario por hora"));
                horasL [i] = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese las horas laboradas"));
                salarioxhora [i] = salarios [i] * horasL[i];
                renta [i] = salarioxhora[i] * 0.10;
                salarioCR [i] = salarioxhora[i]-renta[i];
                
                planilla = salarioCR [i]+planilla;
                
                if (salarioCR [i] > 800)
                    {
                        contador++;
                    }
                
                }
            }
            else if(option==2)
            {
            
                for(i=0; i<N; i++)
                {
                    JOptionPane.showMessageDialog(null,"Nombre: "+ nombres [i] + "\nSalario: " + salarioCR [i]);
                }
                
                JOptionPane.showMessageDialog(null, "Los empleados con sueldos mayores a $800 fueron: " + contador);
                JOptionPane.showMessageDialog(null, "El total en concepto de planilla fue: " + planilla);
                
            
            }else if(option == 3){
                 bandera = false;
            
            }else
            {
             JOptionPane.showMessageDialog(null,"Favor ingrese una opcion valida");
            }
        }
        while(bandera==true);       
        
        
    }
    
}
