/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 17:04
 */

package com.bookstore.shop.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
@Data
public class Category {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME", length=100, nullable=false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> books;


}
