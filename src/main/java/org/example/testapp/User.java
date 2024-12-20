package org.example.testapp;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private String name;
    private List<Post> posts;

    public User(){
        posts = new ArrayList<>();
    }

    public User(String name, List<Post> posts){
        this.name = name;
        this.posts = posts;
    }
}
