package org.zorba;

public class RentOFTwoBHKFlat {
    private Balcony balcony;
    public int calculateRentOfFlat(int noOfPerson){
        return (400*noOfPerson);
    }

    public RentOFTwoBHKFlat(Balcony balcony) {
        this.balcony = balcony;
    }
}
