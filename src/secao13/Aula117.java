package secao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comment;
import entidade.Post;

public class Aula117 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("WOW that's is awesome!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zeland",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Que viagem maneira!");
		Comment c4 = new Comment("Incrível, também quero!");
		
		Post p2 = new Post(sdf.parse("31/12/2019 13:05:44"),
				"Cachoeira - Foz de Iguaçu",
				"Debaixo da cachoeira!",
				44);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
