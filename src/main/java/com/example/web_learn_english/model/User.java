package com.example.web_learn_english.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    private String level;
    private String role;
    private String avatar;
    private LocalDateTime create_at;


    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SurveyResult> surveyResults;
    public User() {}

    public User(String username, String password, String email, String phoneNumber, String level, String role, String avatar, LocalDateTime create_at, List<SurveyResult> surveyResults) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.level = level;
        this.role = role;
        this.avatar = avatar;
        this.create_at = create_at;
        this.surveyResults = surveyResults;
    }

    public User(Long userId, String username, String password, String email, String phoneNumber, String level, String role, String avatar, LocalDateTime create_at, List<SurveyResult> surveyResults) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.level = level;
        this.role = role;
        this.avatar = avatar;
        this.create_at = create_at;
        this.surveyResults = surveyResults;
    }
}
