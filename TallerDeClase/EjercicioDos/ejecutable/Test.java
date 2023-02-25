package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        int i,n,p;
        p=1;
        i=1;
        n= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero : "));
        
        while(i<=n){
            p=p*i;
            i++;



        }
        if(n>=0){
            JOptionPane.showMessageDialog(null,"El factorial de " +n+ " es : "+p );
        }
        else{
            JOptionPane.showMessageDialog(null,"Digite un numero positivo");
         }
            
        

        

        
    }



}