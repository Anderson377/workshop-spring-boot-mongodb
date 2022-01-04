package com.andersondolce.workshopmongo.services;

import com.andersondolce.workshopmongo.domain.Post;
import com.andersondolce.workshopmongo.domain.User;
import com.andersondolce.workshopmongo.dto.UserDTO;
import com.andersondolce.workshopmongo.repository.PostRepository;
import com.andersondolce.workshopmongo.repository.UserRepository;
import com.andersondolce.workshopmongo.services.exception.ObjetoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjetoNotFoundException("Objeto nao encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
