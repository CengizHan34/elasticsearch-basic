package com.example.elasticsearchbasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


/**
 * Created by Cengiz HAN on 01 Nov 2019
 */

@Data
@Document(indexName = "novel", type = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;
}
