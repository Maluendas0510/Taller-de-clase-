package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        int n, c , inver,a;
        inver=0;

        n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de dos o mas cifras : "));
        a=n;
        while (a!=0){
            c = a % 10;
            inver = inver* 10 + c;
            a= a/ 10;
        }
        if(n== inver){
    
            JOptionPane.showMessageDialog(null,"El numero es capicua");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es capicua");
        }

        
    }
}
