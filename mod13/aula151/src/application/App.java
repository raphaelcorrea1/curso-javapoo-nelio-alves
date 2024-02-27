package application;

import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/05/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComent(c1);
        p1.addComent(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        p2.addComent(c3);
        p2.addComent(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
