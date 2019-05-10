/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 16:47
 */

package com.bookstore.shop.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

enum Gender {
    MALE,
    FEMALE
}

@Entity
@Table(name = "USER")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="FIRST_NAME", length=100, nullable=false)
    private String firstName;

    @Column(name="LAST_NAME", length=100, nullable=false)
    private String lastName;

    @Column(name="USERNAME", length=100, nullable=false, unique=true)
    private String username;

    @Column(name="PASSWORD", length=100, nullable=false)
    private String password;

    @Column(name="EMAIL", length=100, nullable=false, unique=true)
    private String email;

    @ManyToOne
    private Role role;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
