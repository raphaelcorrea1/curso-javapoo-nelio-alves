package application;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] nomes = new String[] {"Maria", "Alex", "Bob"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("---------------------------");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
