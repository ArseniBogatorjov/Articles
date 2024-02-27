package com.example.Articals.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, length = 50)
    private String title;

    @Column (nullable = false, length = 50)
    private String slug;

    @Column (nullable = false, length = 50)
    private String description;

    @Column (nullable = false, length = 1000)
    private String content;

    @Column(nullable = false, length = 6)
    private Date created_at;

    @Column(nullable = false, length = 6)
    private Date updated_at;


    @ManyToOne
    @JoinColumn (name = "user_id")
    private  User user;

    @ManyToMany
    @JoinTable (
            name = "article_tag",
            joinColumns = @JoinColumn (name = "article_id"),
            inverseJoinColumns = @JoinColumn (name = "tag_id")
    )
    private List<Tag> tags;

    @ManyToMany
    @JoinTable (
            name = "article_favorite",
            joinColumns = @JoinColumn (name = "article_id"),
            inverseJoinColumns = @JoinColumn (name = "user_id")
    )
    private List<User> favoriteUsers;

    @OneToMany
    @JoinColumn(name = "article_id")
    private List<Comment> comment;

//     @Override
//     public String toString() {
//         return "Article" +
//                 " " + id +
//                 ", title '" + title + '\'' +
//                 ", slug '" + slug + '\'' +
//                 ", description '" + description + '\'' +
//                 ", content '" + content + '\'' +
//                 ", created_at " + created_at +
//                 ", updated_at " + updated_at +
//                 ", user " + user +
//                 ", tags " + tags +
//                 ", favoriteUsers " + favoriteUsers +
//                 ", comment " + comment +
//                 ' ';
//     }
}