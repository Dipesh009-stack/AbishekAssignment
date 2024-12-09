package org.zorba.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Passanger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passengerId;

    private String name;

    private String email;

    private Long mobile;

    private String destination;
}
