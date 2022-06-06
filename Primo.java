import java.util.ArrayList;
import java.util.Scanner;

class Primo {
    public static void main (String args[]){
        
        int x = entrada();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 2; i < 10; i++) {
            int mod = x % i;
            if (mod == 0 && i != x){
                for (int j = 2; j < x; j++) {
                    if (x % j == 0) {
                        lista.add(j);
                    }
                }
            for (int j = 0; j < lista.size(); j++) {
                System.out.print(lista.get(j) + ", ");
            }
            System.exit(0);
            }
        }
        System.out.println("Número primo");

    }
    public static int entrada(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = ler.nextInt();
        ler.close();
        return n;
    }
}