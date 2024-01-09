package com.clarksworld.contentcalender.model;

import java.sql.Struct;
import java.time.LocalDate;

public record Content(
        Integer id,
        String title,
        String desc,
        Status statue,
        Type contentType,
        LocalDate dateCreated,
        LocalDate dateUpdated,
        String url


        ) {

}
