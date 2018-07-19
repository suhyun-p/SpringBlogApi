package com.springblog.api.dto.post;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class WritePostRequest {
    @NotNull
    private String title;

    @NotNull
    private String contents;
}
