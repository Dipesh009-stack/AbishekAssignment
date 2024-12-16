package org.zorba.inheritance;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class IntercityExpress extends Train{

    private Integer noOfCities;
}
