package com.example.Articals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "comment")
public class Comment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, length = 1000)
    private String content;

    @Column(nullable = false, length = 6)
    private Date created_at;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private  User user;

    @ManyToOne
    @JoinColumn (name = "article_id")
    private  Article article;

}
