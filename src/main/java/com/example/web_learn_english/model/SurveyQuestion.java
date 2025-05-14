package com.example.web_learn_english.model;



import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "survey_questions")
public class SurveyQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surveyQuestionId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;

    @Column(nullable = false)
    private String optionA;

    @Column(nullable = false)
    private String optionB;
    @Column(nullable = false)
    private String optionC;
    @Column(nullable = false)
    private String optionD;

    private char correctOption; // 'A', 'B', 'C', 'D'


    @OneToMany(mappedBy = "surveyQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SurveyResult> surveyResults;

    public SurveyQuestion() {
    }

    public SurveyQuestion(String questionText, String optionA, String optionB, String optionC, String optionD, char correctOption, List<SurveyResult> surveyResults) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
        this.surveyResults = surveyResults;
    }

    public SurveyQuestion(Long surveyQuestionId, String questionText, String optionA, String optionB, String optionC, String optionD, char correctOption, List<SurveyResult> surveyResults) {
        this.surveyQuestionId = surveyQuestionId;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
        this.surveyResults = surveyResults;
    }
}
