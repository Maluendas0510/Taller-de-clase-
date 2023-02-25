package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        double c1 ,c2 ,c3 ;
        
        int meses =0;
        c1 =Integer.parseInt(JOptionPane.showInputDialog("Digite la capital de pedro : "));
        c2=Integer.parseInt(JOptionPane.showInputDialog("Digite la capital de juan : "));
        c3 =Integer.parseInt(JOptionPane.showInputDialog("Digite la inversion para el negocio : "));


        while ((c1+c2)<c3){
            meses =meses +1 ;
            c1*=1.03;
            c2*=1.04;
        }
        JOptionPane.showMessageDialog(null, "El numero de meses es : " + meses);


    }

}