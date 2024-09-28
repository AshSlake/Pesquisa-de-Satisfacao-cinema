import java.util.Scanner;

public class App {

    /* Atividade Online
Um cinema possui capacidade de 40 lugares e está sempre com ocupação total. 
Certo dia, cada espectador respondeu a um questionário, no qual constava:

  - idade;
  - opinião em relação ao filme, segundo as seguintes notas:
      A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.

Elabore a codificação em JAVA para que leia os dados, calcule e exiba na tela:
-Ler as informações de 40 espectadores (idade e opinião). 

-quantidade de respostas "ótimo";
- a média de idade das pessoas que responderam "ruim";
- a porcentagem de respostas "péssimo".
- a média geral das notas, considerando que "A = 5", "B = 4", "C = 3", "D = 2", e "E = 1".*/


    public static void main(String[] args){
       
        //declaração das variaveis
        Scanner scan = new Scanner(System.in);
        final int NUMERO_ENTREVISTADOS = 10; // variavel do numero de entevistados

        int quantidadeA = 0;
        int quantidadeB = 0;
        int quantidadeC = 0;
        int quantidadeD = 0;
        int quantidadeE = 0;
        int idadeRuim = 0;
        double porcentagempessimo = 0;
        double mediaGeral = 0;
        String escolha = null;

        System.out.println("Entre com as informaçoes da pesquisa:");

        int i =0;  //contador para as 40 pessoas intrevistadas
        while (i <= NUMERO_ENTREVISTADOS) {  // loop para resgitro das pessoas

            System.out.println("entrevistado n°" + i);
            
            System.out.println("Idade do intrevistado:");
            int idade = scan.nextInt(); // armazenar a idade para utilizar posteriormente 

            do{
            System.out.println("Avaliação do intrevistado: \n"
            + "A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.");
            escolha = scan.next().toUpperCase(); // armazenar a avaliação da pessoa entrevistada
            }
            // expressão casso o usuario escolha um opção fora das estabelecidas
            while(!(escolha.equals("A") || escolha.equals("B") || escolha.equals("C")
            || escolha.equals("D") || escolha.equals("E")));

            switch (escolha) {
                case "A":
                    quantidadeA++;
                    mediaGeral += 5;
                    break;
                case "B":
                    quantidadeB++;
                    mediaGeral += 4;
                    break;
                case "C":
                    quantidadeC++;
                    mediaGeral += 3;
                    break;
                case "D":
                    quantidadeD++;
                    mediaGeral += 2;
                    idadeRuim += idade;
                    break;
                case "E":
                    quantidadeE++;
                    mediaGeral += 1;
                    break;
            }
            i++;
        }

        porcentagempessimo = (quantidadeE * 100) / NUMERO_ENTREVISTADOS; //calculo da porcentagem de respostas pessimas
        idadeRuim /= quantidadeD; //calculo da media das pessoas que deram uma avaliação ruim
        mediaGeral /= NUMERO_ENTREVISTADOS; // Calcula a média geral

        //mensagem final com os resultados
        System.out.println("----------------O resultado final--------------  \n"
        + "A quantidade de respostas Otimas foi: " + quantidadeA + "\n"
        + "A média de idade das pessoas que responderam Ruim foi: " + idadeRuim + "\n"
        + "A porcentagem de respostas que responderam Pessimo foi de: " + porcentagempessimo + "%\n"
        + "A média geral das notas foi de: " + mediaGeral);
    }
}
