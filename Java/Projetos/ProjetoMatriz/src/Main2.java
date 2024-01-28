import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de linhas da matriz?");
        int linha = sc.nextInt();
        System.out.println("Qual a quantidade de colunas da matriz? ");
        int coluna = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.printf("Elemento [%d %d ] \n",i,j);
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0){
                    list.add(matriz[i][j]);
                }

            }

        }
        System.out.println("Valores Negativos");
        System.out.println(list);
        sc.close();
    }
}
