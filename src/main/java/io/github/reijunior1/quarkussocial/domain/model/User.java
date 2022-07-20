package io.github.reijunior1.quarkussocial.domain.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

}
