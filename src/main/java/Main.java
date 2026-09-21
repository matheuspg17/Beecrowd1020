
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int ano, mes, dia, idadedias;
        
        //entrada de dados
        idadedias = leia.nextInt();
        
        //processamento (idade em ano(s))
        ano = idadedias / 365;
        
        //processamento (idade em mes(es))
        mes = (idadedias % 365);
        mes = mes / 30;
        
        //processamento (idade em dia(s))
        dia = idadedias % 365;
        dia = dia % 30;
        
        //saida de dados
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        
    }
}
