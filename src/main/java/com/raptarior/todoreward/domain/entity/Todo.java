package com.raptarior.todoreward.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {

    private Long todoNo;
    private String subject;
    private String content;
    private int reward;
    private boolean completed;

}
