package tech.goodquestion.website.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.goodquestion.website.entity.User;
import tech.goodquestion.website.service.UserServiceImpl;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user/")
@CrossOrigin("*")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("registration")
    public ResponseEntity<String> signIn(@Valid @RequestBody User user) {

        logger.info("User created: " + user);

        userService.createAccount(user);

        return new ResponseEntity<>("Account wurde erfolgreich angelegt!", HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable long userId) {

        logger.info("Id entered: " + userId);

       return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);

    }
}
