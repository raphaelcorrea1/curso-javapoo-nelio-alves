package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> candidates = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while(line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (candidates.containsKey(name)) {
                    int votesSoFar = candidates.get(name);
                    candidates.put(name, votes + votesSoFar);
                }
                else {
                    candidates.put(name, votes);
                }

                line = br.readLine();
            }

            for(String key : candidates.keySet()) {
                System.out.println(key + ": " + candidates.get(key));
            }



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
