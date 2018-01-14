package com.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Article {
    @Id
    private String name;
    private String preview;
    private String content;
}
