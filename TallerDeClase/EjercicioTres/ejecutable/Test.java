package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    { 
        int n,v;
        v=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

        for (int i = 1; i <= n; i++) 
            if(n % i == 0 )
            v++;  
        if(v!=2){
                JOptionPane.showMessageDialog(null,"El numero no es primo");
            }
        else{
                JOptionPane.showMessageDialog(null,"El numero es primo");
        }
    }

}
