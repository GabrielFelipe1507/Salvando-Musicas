import java.util.Scanner;

public class CamaroteBlueColdIceCubes {
    /*
     * No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, 
     * escolheu todas as pessoas que estavam na posição impar da fila para 
     * entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram
     *  a loucura para competirem por essas posições. Você resolveu criar um
     *  programa para saber, de acordo com o número de pessoas na fila, quantas
     *  entrariam no camarote.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tamanhoFila = leitor.nextInt();

       if(tamanhoFila%2 == 0){
        System.out.println((tamanhoFila/2) + " pessoas no camarote");
       }else{
        System.out.println(((tamanhoFila/2)+1) + " pessoas no camarote");
       }
    }
}
