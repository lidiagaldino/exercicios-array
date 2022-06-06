import java.util.ArrayList;
import java.util.Scanner; 

class PrimoDois{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println("Insira um numero inteiro maior que 1: ");
        int n = ler.nextInt();

        while (n < 2) {
            System.out.print("Número inválido, digite um número inteiro maior que 1: ");
            n = ler.nextInt();
        }

        for (int i = 2; i <= (n/2); i++) {
            int mod = n % i;
            if (mod == 0) {
                lista.add(i);
            }
        }
        if (lista.size() == 0) {
            System.out.print("Número primo");
        } else{
            System.out.print(1+" - ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i)+" - ");
            }
            System.out.print(n);
        }
        ler.close();
    }
}