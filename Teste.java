import java.util.ArrayList;
class Teste{
    public static void main(String args[]){
        ArrayList<Integer> idade = new ArrayList<Integer>();
        ArrayList<String> cidade = new ArrayList<String>();
        ArrayList<Object> lista = new ArrayList<Object>();

        lista.add(1000);
        lista.add(3.7);
        lista.add("eu");
        lista.add(true);
        lista.add('e');

        idade.add(25);
        idade.add(30);

        cidade.add("Bogota");
        cidade.add("Tegucigalpa");

        System.out.println(lista);
        System.out.println(idade);
        System.out.println(cidade.get(cidade.size()-1));

        idade.clear();
    }
}