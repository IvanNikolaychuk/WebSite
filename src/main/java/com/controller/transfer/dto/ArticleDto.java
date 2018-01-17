package com.controller.transfer.dto;

import com.entity.Article;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ArticleDto {
    private static final String DATE_FORMAT_PATTERN = "dd-MM-yyyy";

    public String preview;
    public String name;
    public List<String> tags;
    public String creationDate;

    public ArticleDto(Article article) {
        this.preview = article.getPreview();
        this.name = article.getName();
        this.tags = article.getTags();
        this.creationDate = toString(article.getCreationDate());
    }

    private String toString(Date creationDate) {
        return new SimpleDateFormat(DATE_FORMAT_PATTERN).format(creationDate);
    }
}
