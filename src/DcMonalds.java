import java.util.Scanner;

public class DcMonalds {

    /*
     * Você levou sua namorada na incrível rede de lanchonetes Dc
     *  Monalds e ficou maravilhado como aquele lanche era gostoso.
     *  Porém, ficou horrorizado como algumas coisas no aplicativo 
     * do cardápio estavam erradas. Então, você se ofereceu para 
     * ajudá-los com seus conhecimentos de programação. Ao conversar 
     * com o gerente, ele te explicou que a vontade da lanchonete
     * era criar um menu com os nomes dos ingredientes formando o 
     * lanche, como no exemplo abaixo:
        Pao
        Presunto
        Carne
        Pao
    Ajude o restaurante a programar isso.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String comida;

        comida = leitor.nextLine();

        String array[] = comida.split(";");

        System.out.println(array[0] + "\n" + array[1] + "\n" + array[2] + "\n" + array[3]);
    }

}