package org.zorba.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class General extends Passanger {
    private String seatNumber;

    private String coachType;

}
