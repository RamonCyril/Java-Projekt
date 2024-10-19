import javax.swing.*;

public class meier {
    public static void main(String[] args) {

        int zahl= Integer.parseInt(JOptionPane.showInputDialog(null,"Sag eine zahl!"));

        if (zahl<16){
            System.out.println("Ich bin besser als: "+zahl+" Personen");
        }
        else if(zahl>16){
            System.out.println("Ich bin schlechter als: "+zahl+" Personen");
        }
        else {
            System.out.println("Ich bin der beste!");
    }

    }
}
