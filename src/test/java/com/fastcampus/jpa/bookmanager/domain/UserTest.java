package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("ishwang@naver.com");
        user.setName("ishwang");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        System.out.println(user.toString());

        User user2 = new User(null, "yourName", "yourEmail", LocalDateTime.now(), LocalDateTime.now());
        User user1 = new User("myName", "myEmail");

        User user3 = User.builder()
                .name("mr.kkang")
                .email("kkang@naver.com")
                .build(); //RequiredArgConstructor
    }
}