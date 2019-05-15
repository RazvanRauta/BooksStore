/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 11:44
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.User;

import java.util.List;

public interface UserFactory {

    User create(User user);

    void delete(Long id);

    User update(User user);

    User getUserById(Long id);

    List<User> getAllUser();

    User getUserByEmailAndUsername(String email, String username);

    User getUserByEmil(String email);
}
