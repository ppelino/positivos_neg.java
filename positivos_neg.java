import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {
    //Identificar se há exatamente um número positivo entre três número dados
    Scanner leitor = new Scanner(System.in);
    
        System.out.println("Insira um número: ");
        int nu1 = leitor.nextInt();
        System.out.println("Insira um número: ");
        int nu2 = leitor.nextInt();
        System.out.println("Insira um número: ");
        int nu3 = leitor.nextInt();
    
        if (nu1 > 0 && nu2 > 0 && nu3 > 0) {
            System.out.println("3 números positivos foram encontrados");
        } else if (nu1 < 0 && nu2 < 0 && nu3 < 0) {
            System.out.println("3 números negativos foram encontrados");
        }else if (nu1 > 0 && nu2 < 0 && nu3 < 0) {
            System.out.println("1 número positivo foi encontrado");
        }else if (nu1 < 0 && nu2 > 0 && nu3 < 0) {
            System.out.println("1 número positivo foi encontrado");
        }else if (nu1 < 0 && nu2 < 0 && nu3 > 0) {
            System.out.println("1 número positivo foi encontrado");
        }else if (nu1 > 0 && nu2 > 0 && nu3 < 0) {
            System.out.println("2 números positivos foram encontrados");
        }else if (nu1 < 0 && nu2 > 0 && nu3 > 0) {
            System.out.println("2 números positivos foram encontrados");
        }else if (nu1 > 0 && nu2 < 0 && nu3 > 0) {
            System.out.println("2 números positivos foram encontrados");
        }else{
            System.out.println("Não há números");
        }

    }
}
