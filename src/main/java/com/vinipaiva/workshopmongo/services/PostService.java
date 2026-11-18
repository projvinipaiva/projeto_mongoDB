package com.vinipaiva.workshopmongo.services;

import com.vinipaiva.workshopmongo.domain.Post;
import com.vinipaiva.workshopmongo.domain.User;
import com.vinipaiva.workshopmongo.dto.UserDTO;
import com.vinipaiva.workshopmongo.repository.PostRepository;
import com.vinipaiva.workshopmongo.repository.UserRepository;
import com.vinipaiva.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate) ;
    }


}