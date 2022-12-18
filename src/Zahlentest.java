import javax.swing.*;

public class Zahlentest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein.");
        var doubleZahl = Double.parseDouble(eingabe);

        if(doubleZahl < 0.0){
            JOptionPane.showMessageDialog(null, "Die Zahl ist negativ!");
        } else{
            JOptionPane.showMessageDialog(null, "Die Zahl ist nicht negativ!");
        }
    }
}
