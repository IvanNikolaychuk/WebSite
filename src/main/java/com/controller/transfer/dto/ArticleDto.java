package com.controller.transfer.dto;

import com.entity.Article;

import java.util.Date;
import java.util.List;

public class ArticleDto {
    public String preview;
    public String name;
    public List<String> tags;
    public Date creationDate;

    public ArticleDto(Article article) {
        this.preview = article.getPreview();
        this.name = article.getName();
        this.tags = article.getTags();
        this.creationDate = article.getCreationDate();
    }
}
