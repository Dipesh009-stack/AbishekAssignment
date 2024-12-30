package org.zorba;

public class RentOfThreeBHKFlat {
    private Balcony balcony;
    public int  calculateRentOneBhk(int noOfPerson){
        return (600*noOfPerson);
    }

    public RentOfThreeBHKFlat(Balcony balcony) {
        this.balcony = balcony;
    }
}
