package com.github.timebetov;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class DemoEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    public DemoEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
