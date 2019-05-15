/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 14:01
 */

package com.bookstore.shop.persistence.repository;

import com.bookstore.shop.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
