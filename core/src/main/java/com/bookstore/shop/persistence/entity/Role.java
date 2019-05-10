/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 17:56
 */

package com.bookstore.shop.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROLE")
@Data
public class Role {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
