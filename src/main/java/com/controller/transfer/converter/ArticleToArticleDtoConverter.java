package com.controller.transfer.converter;

import com.controller.transfer.dto.ArticleDto;
import com.entity.Article;

import java.util.List;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;

public class ArticleToArticleDtoConverter {
    public static List<ArticleDto> convert(Iterable<Article> articles) {
        return StreamSupport.stream(articles.spliterator(), false)
                .map(ArticleDto::new)
                .collect(toList());
    }
}
