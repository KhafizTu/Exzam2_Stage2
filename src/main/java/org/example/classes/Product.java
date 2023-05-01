package org.example.classes;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    @Id
    @GeneratedValue(generator = "social_media_gen")
    @SequenceGenerator(
            name = "social_media_gen",
            sequenceName = "social_media_seq,",
            allocationSize = 1)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "year_of_issue")
    private LocalDate yearOfIssue;
    @Column(name = "price")
    private int price;

    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private Company company;
    @OneToMany(mappedBy = "product",
            cascade = {CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH
    })
    private List<Category> categories;

    public Product(String name, LocalDate yearOfIssue, int price) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }

}
