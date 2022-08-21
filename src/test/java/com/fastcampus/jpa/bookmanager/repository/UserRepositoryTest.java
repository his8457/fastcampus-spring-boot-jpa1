package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){//create, read, update, delete
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1l, 3l, 5l));
        User user1 = new User("Tim", "Tim@email.com");
        User user2 = new User("Kim","Kim@email.com");

        userRepository.saveAll(Lists.newArrayList(user1, user2));

        List<User> result = userRepository.findAll();

        result.forEach(System.out::println);
    }
}