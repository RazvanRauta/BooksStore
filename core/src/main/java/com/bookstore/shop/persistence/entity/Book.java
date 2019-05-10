/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 16:36
 */

package com.bookstore.shop.persistence.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "BOOK")
@Data
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE", length=100, nullable=false)
    private String title;

    @Column(name = "AUTHOR", length=100, nullable=false)
    private String author;

    @Column(name = "YEAR", nullable=false)
    private Long year;

    @Column(name = "PRICE", nullable=false)
    private float price;

    @ManyToOne
    private Category category;

    @Column(name = "STOCK", length=100, nullable=false)
    private Long stock;
}
