package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to new","I'm going to visited",12);
        p1.addComment(c1);
        p1.addComment(c2);

        //comentario2
        Comment c3 = new Comment("Cidade Linda!");
        Comment c4 = new Comment("Blumenau");
        Post p2 = new Post(sdf.parse("31/01/2024 13:05:44"),"Vou Visita voces","Blumenauses",100);
        p2.addComment(c3);
        p2.addComment(c4);


        System.out.println(p1);
        System.out.println(p2);
    }
}
