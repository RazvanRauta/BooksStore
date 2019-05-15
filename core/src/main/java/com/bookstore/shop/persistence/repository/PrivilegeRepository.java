/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 14:02
 */

package com.bookstore.shop.persistence.repository;

import com.bookstore.shop.persistence.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    Privilege findByName(String name);
}
