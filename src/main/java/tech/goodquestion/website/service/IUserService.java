package tech.goodquestion.website.service;

import tech.goodquestion.website.entity.User;

import java.util.Optional;

public interface IUserService {

    void createAccount(User user);
    Optional<User> getUserById(long userId);
}
