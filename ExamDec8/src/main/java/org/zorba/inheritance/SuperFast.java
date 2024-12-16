package org.zorba.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("SuperFast")
public class SuperFast extends Train {
    private Integer fareCharges;
}
