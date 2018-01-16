package com.controller.api;

import com.controller.transfer.converter.ArticleToArticleDtoConverter;
import com.repository.ArticleRepository;
import com.controller.transfer.dto.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.controller.transfer.converter.ArticleToArticleDtoConverter.convert;

@RestController
@RequestMapping(value = ("api/articles"))
public class ArticleApi {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleApi(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @RequestMapping("/")
    public List<ArticleDto> findAll() {
        return convert(articleRepository.findAll());
    }
}