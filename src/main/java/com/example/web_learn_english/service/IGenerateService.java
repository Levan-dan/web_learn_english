package com.example.web_learn_english.service;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();
    T findById(int id);
    T save(T entity);
    void deleteById(int id);
}
