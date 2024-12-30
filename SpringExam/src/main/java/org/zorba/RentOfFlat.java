package org.zorba;

public class RentOfFlat {
    private RentOfOneBHKFlat rentOfOneBHKFlat;
    private RentOFTwoBHKFlat rentOFTwoBHKFlat;

    public RentOfFlat(RentOfOneBHKFlat rentOfOneBHKFlat, RentOFTwoBHKFlat rentOFTwoBHKFlat) {
        this.rentOfOneBHKFlat = rentOfOneBHKFlat;
        this.rentOFTwoBHKFlat = rentOFTwoBHKFlat;
    }
}
