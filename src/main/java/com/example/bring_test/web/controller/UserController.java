package com.example.bring_test.web.controller;

import com.example.bring_test.web.dto.User;
import com.example.bring_test.web.dto.UserFactory;
import svydovets.web.annotation.DeleteMapping;
import svydovets.web.annotation.GetMapping;
import svydovets.web.annotation.PatchMapping;
import svydovets.web.annotation.PathVariable;
import svydovets.web.annotation.PostMapping;
import svydovets.web.annotation.PutMapping;
import svydovets.web.annotation.RequestBody;
import svydovets.web.annotation.RequestMapping;
import svydovets.web.annotation.RequestParam;
import svydovets.web.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/users")
public class UserController {

    private AtomicLong idGenerator = new AtomicLong(0L);
    private Map<Long, User> userMap = new ConcurrentHashMap<>();

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        User savedUser = userMap.get(id);
        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setStatus(user.getStatus());
        userMap.put(id, savedUser);
        return savedUser;
    }

    @GetMapping("/{id}")
    public User getOneById(@PathVariable Long id) {
        return userMap.get(id);
    }

    @GetMapping
    public User getOneByFirstName(@RequestParam String firstName) {
        return userMap.values()
                .stream()
                .filter(user -> user.getFirstName().equals(firstName))
                .findAny()
                .orElseGet(UserFactory::createDefaultUser);
    }

    @PostMapping
    public Long save(@RequestBody User user) {
        Long generatedId = idGenerator.incrementAndGet();
        user.setId(generatedId);
        userMap.put(generatedId, user);
        return generatedId;
    }

    @PatchMapping("/{id}")
    public User updateUserFirstNameById(@PathVariable Long id, @RequestParam("name") String firstName) {
        User user = userMap.get(id);
        user.setFirstName(firstName);
        userMap.put(id, user);

        return user;
    }

    @DeleteMapping("/{id}")
    public void removeWithServletRequestAndResponse(@PathVariable Long id) {
        userMap.remove(id);
    }
}
