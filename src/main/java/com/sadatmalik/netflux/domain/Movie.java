package com.sadatmalik.netflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // tells spring data this is a Mongo document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {
    private String id;

    @NonNull
    private String title;
}