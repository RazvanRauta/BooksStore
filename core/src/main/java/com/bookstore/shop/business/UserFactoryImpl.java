/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 11:45
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.User;
import com.bookstore.shop.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFactoryImpl implements UserFactory {

    private final UserRepository userRepository;

    @Autowired
    public UserFactoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmailAndUsername(String email, String username) {
        return userRepository.findByEmailAndUsername(email, username);
    }

    @Override
    public User getUserByEmil(String email) {
        return userRepository.findByEmail(email);
    }
}
