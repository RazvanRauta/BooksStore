/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 16:36
 */

package com.bookstore.shop.persistence.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private Long year;

    private float price;

    @ManyToOne
    private Category category;

    private Long stock;
}
