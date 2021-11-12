
package EntraSaliJOption;

import javax.swing.JOptionPane;

public class JoptionP {
    public static void main (String [] args){
        String texto;
        int entero;
        double decima;
        
        JOptionPane.showMessageDialog(null, ("\t\t\t Usando el JOptionPane para la entrada y salida de datos"));
        
        texto = JOptionPane.showInputDialog("Hola ingresa un texto: "); //Otro forma para la entrada de datos en JAVA es con JOption
        entero = Integer.parseInt(JOptionPane.showInputDialog("Hola mete un numero: "));
        decima = Double.parseDouble(JOptionPane.showInputDialog("Numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "Hola the message is: "+texto+ "\nEl numero es> "+entero+
                "\nEl numero decimal es: "+decima);
    }
}
