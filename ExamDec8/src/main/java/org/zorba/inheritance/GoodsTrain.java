package org.zorba.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("GoodsTrain")
public class GoodsTrain extends Train {
    private String typeOfGoods;
}
