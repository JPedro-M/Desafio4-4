package desafio4.pkg4;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio44 {
    public static void main(String[] args) {
        int num1, num2, num3, total;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (num1%2 != 0 && num2%2 != 0 && num3%2 != 0) {
            total = num1*num2*num3;
        }else {
            total = num1+num2+num3;
        }
        
        JOptionPane.showMessageDialog(null, "O total é:"+total);
    }  
}
