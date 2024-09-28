public class TabuadaGiovanna {

     /*
         * Atividade Facultativa (não obrigatória)
         * 
         * Na Agenda 7, você realizou este exercício com a Estrutura de Repetição PARA (for).
         * Agora, realize com a Estrutura de Repetição: while ou do while (você pode escolher).
         * Giovanna adora usar computador, navegar na internet e matemática. Ela decidiu estudar
         * tabuada devido a sua dificuldade durante o período de aula (ela apenas sabe as tabuadas
         * dos números 0 até 05). 
         * Ao navegar na internet, aprendeu a desenvolver alguns algoritmos
         * e decidiu desenvolver algo para ajudá-la em seus estudos com tabuada.
         */

         public static void main(String[] args){

                // Loop para as tabuadas de 0 até 5
                int tabuada = 0 , tabuadaMaxima = 5;
                do{
                System.out.println("Tabuada do " + tabuada + ":");

                //loop para multiplicar cada numero
                int multiplicador = 0;
                do{
                    int resultado = tabuada * multiplicador;
                    System.out.println(tabuada + " x " + multiplicador + " = " + resultado); // resultado das multiplicações
                    multiplicador++;
                }while(multiplicador <= 10);

                System.out.println("\n");
                tabuada++;

                } while (tabuada <= tabuadaMaxima);
            }
        }
