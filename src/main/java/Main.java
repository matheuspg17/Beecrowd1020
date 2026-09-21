
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano, mes, dia, idadedias;
        
        idadedias = leia.nextInt();
        
        ano = idadedias / 365;
        
        mes = (idadedias % 365);
        mes = mes / 30;
        
        dia = idadedias % 365;
        dia = dia % 30;
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        
    }
}
