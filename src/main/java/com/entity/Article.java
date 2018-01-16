package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class Article {
    @Id
    private String name;
    private String preview;
    private Date creationDate;
    @ElementCollection
    @Column(name="tag")
    private List<String> tags;

    public Article(String name, String preview, Date creationDate, String... tags) {
        this.name = name;
        this.preview = preview;
        this.creationDate = creationDate;
        this.tags = Arrays.asList(tags);
    }

    public Article() {}

}
