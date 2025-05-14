package com.example.web_learn_english.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "survey_results")
public class SurveyResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User users;

    @ManyToOne
    @JoinColumn(name = "surveyQuestion_id", nullable = false)
    private SurveyQuestion surveyQuestion;

    private char selectedOption;
    private boolean isCorrect;

    private int point;

    public SurveyResult() {}

    public SurveyResult(User users, SurveyQuestion surveyQuestion, char selectedOption, boolean isCorrect, int point) {
        this.users = users;
        this.surveyQuestion = surveyQuestion;
        this.selectedOption = selectedOption;
        this.isCorrect = isCorrect;
        this.point = point;
    }

    public SurveyResult(Long resultId, User users, SurveyQuestion surveyQuestion, char selectedOption, boolean isCorrect, int point) {
        this.resultId = resultId;
        this.users = users;
        this.surveyQuestion = surveyQuestion;
        this.selectedOption = selectedOption;
        this.isCorrect = isCorrect;
        this.point = point;
    }
}
