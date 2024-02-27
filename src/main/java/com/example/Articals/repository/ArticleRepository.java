package com.example.Articals.repository;

import com.example.Articals.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Long> {
    List <Article> findByTitle (String title);



}
