package com.repository;

import com.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ArticleRepository extends CrudRepository<Article, String> {
}
