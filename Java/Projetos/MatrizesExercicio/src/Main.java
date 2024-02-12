import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da matriz: ");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];
        double soma = 0.0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento[%d,%d]: ",i,j);
                mat[i][j] = sc.nextDouble();
                if (mat[i][j] > 0){
                    soma+= mat[i][j];
                }
            }




        }

        System.out.print("Escolha uma linha");
        int linha = sc.nextInt();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[linha][j]+ " ");

            }}

        System.out.print("\n Escolha uma coluna");
        int coluna = sc.nextInt();


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(mat[i][coluna]+" ");

            }}

        System.out.print("\n DIAGONAL PRINCIPAL:");
        for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][i]+" ");

            }

        System.out.println("\n SOMA DOS POSITIVOS:"+ soma);


        sc.close();

    }
}