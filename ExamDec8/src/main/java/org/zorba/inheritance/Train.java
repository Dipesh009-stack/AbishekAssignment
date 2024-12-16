package org.zorba.inheritance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "train_type", discriminatorType = DiscriminatorType.STRING)

public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "train_id")
    private Integer trainId;

    private String trainName;
    private Integer noOfCoach;
    private String trainStartStation;
    private String trainEndStation;
    private String trainType;
    private String trainWeeklyDaysSchedule;
    private Integer abvgSpeed;
    private Integer fareCharges;


}
