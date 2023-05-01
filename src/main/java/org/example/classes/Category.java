package org.example.classes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Category {
    @Id
    @GeneratedValue(generator = "category_gen")
    @SequenceGenerator(
            name = "category_gen",
            sequenceName = "category_seq" ,
            allocationSize = 1)
    private Long id;
    @Column(name = "category_name")
    private String name;
    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private Product product;

    public Category(String name) {
        this.name = name;
    }
}
