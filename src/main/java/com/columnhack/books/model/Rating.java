package com.columnhack.books.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    FIVE_STARS("⭐️⭐️⭐️⭐️⭐️"),
    FOUR_STARS("⭐️⭐️⭐️⭐️"),
    THREE_STARS("⭐️⭐️⭐️"),
    TWO_STARS("⭐️⭐️"),
    ONE_STAR("⭐️");

    private String star;

    Rating(String stars) {
        this.star = stars;
    }

    @JsonValue
    public String getStar(){
        return star;
    }
}
