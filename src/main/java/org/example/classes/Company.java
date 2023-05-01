package org.example.classes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "companies")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Company {
    @Id
    @GeneratedValue(generator = "social_media_gen")
    @SequenceGenerator(
            name = "social_media_gen",
            sequenceName = "social_media_seq,",
            allocationSize = 1)
    private Long id;
    @Column(name = "company_name")
    private String name;
    @Column(name = "company_country")
    private String country;

    @OneToMany(mappedBy = "company",
            cascade = {CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH,
    })
    private List<Product> products;

    public Company(String name, String country, List<Product> products) {
        this.name = name;
        this.country = country;
        this.products = products;
    }

    public Company(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
