import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class ParesImparesCrescente {

    public static void main(String[] args) throws IOException {

     try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de números a inserir: ");

        int qtdeNum = sc.nextInt();
        int entrada;

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        if (qtdeNum > 1 && qtdeNum<10000) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Informe os números: ");

            for (int i = 1; i <= qtdeNum; i++) {

                entrada = leitor.nextInt();
                if (entrada % 2 == 0) {
                    lista1.add(entrada);
                } else {
                    lista2.add(entrada);
                }
            }
            Collections.sort(lista1);
            Collections.sort(lista2);
            Collections.reverse(lista2);

            for (Integer paresCrescente : lista1)
                System.out.println(paresCrescente);

            for (Integer imparesDecrescente : lista2)
                System.out.println(imparesDecrescente);

            sc.close();
            leitor.close();
        }
       }
     catch (Exception e){
         System.out.println(e.getMessage());
      }
   }
 }


