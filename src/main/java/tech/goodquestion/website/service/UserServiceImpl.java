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
    public void logIn(User user) {

    }

    @Override
    public void resetPassword(User user) {

    }

    @Override
    public Optional<User> getUserById(long userId) throws Exception {

        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) throw new Exception();

        return optionalUser;

    }

    @Override
    public User getProfileData(User user) {

        return null;

    }
}
