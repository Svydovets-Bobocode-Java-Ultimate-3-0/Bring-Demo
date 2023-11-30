package com.example.bring_test.web.controller;

import com.example.bring_test.web.dto.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import svydovets.web.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import static com.example.bring_test.web.dto.UserFactory.DEFAULT_FIRST_NAME;
import static com.example.bring_test.web.dto.UserFactory.DEFAULT_ID;
import static com.example.bring_test.web.dto.UserFactory.DEFAULT_LAST_NAME;
import static com.example.bring_test.web.dto.UserFactory.DEFAULT_STATUS;

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

    @PostMapping
    public Long save(@RequestBody User user) {
        Long generatedId = idGenerator.incrementAndGet();
        user.setId(generatedId);
        userMap.put(generatedId, user);
        return generatedId;
    }

    @GetMapping
    public User getOneByFirstName(@RequestParam String firstName) {
        return userMap.values()
                .stream()
                .filter(user -> user.getFirstName().equals(firstName))
                .findAny()
                .orElseThrow();
    }

    @GetMapping("/{id}")
    public User getOneById(@PathVariable Long id) {
        return userMap.get(id);
    }

    @PatchMapping
    public User updateUserFirstNameById(@PathVariable Long id, @RequestBody String firstName) {
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
