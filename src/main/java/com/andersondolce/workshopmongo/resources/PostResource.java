package com.andersondolce.workshopmongo.resources;

import com.andersondolce.workshopmongo.domain.Post;
import com.andersondolce.workshopmongo.domain.User;
import com.andersondolce.workshopmongo.dto.UserDTO;
import com.andersondolce.workshopmongo.services.PostService;
import com.andersondolce.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
