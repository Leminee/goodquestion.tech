package tech.goodquestion.website.service;

import org.springframework.stereotype.Service;
import tech.goodquestion.website.entity.User;
import tech.goodquestion.website.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createAccount(User user) {

        userRepository.save(user);

    }

    @Override
    public Optional<User> getUserById(long userId) {

        return userRepository.findById(userId);

    }

}
