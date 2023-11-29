package com.example.bring_test.controller;

import com.example.bring_test.dto.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import svydovets.web.annotation.*;

import static com.example.bring_test.dto.UserFactory.DEFAULT_FIRST_NAME;
import static com.example.bring_test.dto.UserFactory.DEFAULT_ID;
import static com.example.bring_test.dto.UserFactory.DEFAULT_LAST_NAME;
import static com.example.bring_test.dto.UserFactory.DEFAULT_STATUS;

@RestController
@RequestMapping("/valid/users")
public class ValidUserController {

    @GetMapping("/{id}")
    public User getOneById(@PathVariable Long id) {
        return new User(id, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_STATUS);
    }

    @GetMapping
    public User getOneByFirstName(@RequestParam String firstName) {
        return new User(DEFAULT_ID, firstName, DEFAULT_LAST_NAME, DEFAULT_STATUS);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return user;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestParam String status, @RequestBody User user) {
        Long newId = id + 1L;
        return new User(newId, user.getFirstName(), user.getLastName(), status);
    }

    @DeleteMapping
    public void removeWithServletRequestAndResponse(HttpServletRequest request, HttpServletResponse resp) {
    }
}
