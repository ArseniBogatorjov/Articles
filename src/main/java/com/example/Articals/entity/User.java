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
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, length = 60)
    private String email;

    @Column ( nullable = false, length = 30)
    private String userName;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(length = 500)
    private String bio;

    @Column(nullable = false, length = 6)
    private Date created_at;

    @OneToMany(mappedBy = "user")
    private List<Article> articles;

    @ManyToMany
    @JoinTable (
            name = "user_follow",
            joinColumns = @JoinColumn (name = "following_id"),
            inverseJoinColumns = @JoinColumn (name = "follower_id")
    )
    private List<Tag> tags;

}
