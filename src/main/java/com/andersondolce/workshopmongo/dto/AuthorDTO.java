package com.andersondolce.workshopmongo.dto;

import com.andersondolce.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(){

    }
    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }

    public AuthorDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
