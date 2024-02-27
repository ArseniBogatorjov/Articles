package com.example.Articals;

import com.example.Articals.entity.Article;
import com.example.Articals.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ArticalsApplication implements CommandLineRunner {
	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ArticalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Article> list = articleRepository.findByTitle("JAVA8");
		for ( Article article: list) {
			System.out.println(article);}
	}

}
