package org.zorba.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class PhysicallyHandicapp extends Passanger {
    private String seatNumber;

    private String proofOfDisability;
}
