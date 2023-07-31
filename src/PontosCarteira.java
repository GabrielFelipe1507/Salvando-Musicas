import java.util.Scanner;

public class PontosCarteira {
    public static void main(String[] args) {
        /*
         * A prefeitura da cidade B, inspirada por uma cidade A, decidiu
         * implementar um sistema de câmeras que iria verificar se os carros
         * estão acima de 80km/h. Porém, eles queriam também anotar a placa
         * dos carros no banco de dados para que, a partir de 3 multas, os
         * motoristas perdessem pontos diretamente na carteira de habilitação.
         * Para isso, contrataram você para realizar esse programa, logo que
         * você fez um trabalho tão bom para a cidade A.
         * Lembrando que toda vez que um carro é pego pela câmera e está acima
         * da velocidade permitida automaticamente já é contabilizado uma multa para
         * ele.
         */

        Scanner leitor = new Scanner(System.in);

        int velocidade = leitor.nextInt();
        int qtdMultas = leitor.nextInt();

        if (velocidade <= 80) {
            if (qtdMultas > 0 && qtdMultas == 1) {
                System.out.println(qtdMultas + " multas. Nao levou pontos na carteira");
            } else if (qtdMultas == 2) {
                System.out.println(qtdMultas + " multas. Nao levou pontos na carteira");
            } else if (qtdMultas >= 3) {
                System.out.println(qtdMultas + " multas. Levou pontos na carteira");
            }
        
        } else if (velocidade > 80) {
            if (qtdMultas > 0 && qtdMultas == 1) {
                qtdMultas = qtdMultas + 1;
                System.out.println(qtdMultas + " multas. Nao levou pontos na carteira");
            } else if (qtdMultas >= 2) {
                qtdMultas = qtdMultas + 1;
                System.out.println(qtdMultas + " multas. Levou pontos na carteira");
            } 
        }
    }
}
