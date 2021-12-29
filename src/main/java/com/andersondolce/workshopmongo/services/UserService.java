package com.andersondolce.workshopmongo.services;

import com.andersondolce.workshopmongo.domain.User;
import com.andersondolce.workshopmongo.dto.UserDTO;
import com.andersondolce.workshopmongo.repository.UserRepository;
import com.andersondolce.workshopmongo.services.exception.ObjetoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjetoNotFoundException("Objeto nao encontrado"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }


    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj){
        User newObjt = findById(obj.getId());
        updateData(newObjt, obj);
        return repo.save(newObjt);
    }

    private void updateData(User newObjt, User obj) {
        newObjt.setName(obj.getName());
        newObjt.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
