package org.zorba.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("LocalTrain")
public class LocalTrain extends Train {
    private String frequency;
}
