/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpaint;

import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class provides a form for create a new canvass with the desired dimensions
 * 
 * @author Darth-ATA
 */
public class WindowDimension {
    
    /**
     * Default constructor of the WindowDimension.
     */
    public WindowDimension(){}
    
    /**
     * This method provides the dimension desired for the user using a form for it.
     * @return an ArrayList with two integer the width and the heigth desired.
     */
    public static ArrayList<Integer> showWindowDimension(){
        JTextField width = new JTextField(5);
        JTextField heigth = new JTextField(5);
        
        JPanel panel = new JPanel();
        width.setText("600");
        panel.add(new JLabel("Width"));
        panel.add(width);
        heigth.setText("500");
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Heigth"));
        panel.add(heigth);
        boolean ok = false;
        int result = JOptionPane.showConfirmDialog(null, panel,
                "Introduce the width and the geigth of the canvass", JOptionPane.OK_CANCEL_OPTION);
        while (result == JOptionPane.OK_OPTION && !ok){
            try {
                double w = Double.parseDouble(width.getText());
                double h = Double.parseDouble(heigth.getText());
                if (width.getText().equals("") || heigth.getText().equals("") || 
                        Integer.parseInt(width.getText()) == 0 || Integer.parseInt(heigth.getText()) == 0){
                    JOptionPane.showMessageDialog(null, "Please introduce a numer greater than 0");
                    result = JOptionPane.showConfirmDialog(null, panel, 
                            "Introduce the width and the heigth of the canvass", JOptionPane.OK_CANCEL_OPTION);
                }
                else{
                    ok = true;
                }
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error: Introduce a number");
                result = JOptionPane.showConfirmDialog(null, panel, 
                        "Introduce the width and the heigth of the canvass", JOptionPane.OK_CANCEL_OPTION);
            }
        }
        if (result == JOptionPane.OK_OPTION){
            ArrayList<Integer> al = new ArrayList();
            al.add(Integer.parseInt(width.getText()));
            al.add(Integer.parseInt(heigth.getText()));
            return al;
        }
        return null;        
    }
}
