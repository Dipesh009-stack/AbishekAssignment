package org.zorba;

public class Property {
   private RentOfFlat rentOfFlat;
   private SelfOwnedFlat selfOwnedFlat;

    public RentOfFlat getRentOfFlat() {
        return rentOfFlat;
    }

    public void setRentOfFlat(RentOfFlat rentOfFlat) {
        this.rentOfFlat = rentOfFlat;
    }

    public SelfOwnedFlat getSelfOwnedFlat() {
        return selfOwnedFlat;
    }

    public void setSelfOwnedFlat(SelfOwnedFlat selfOwnedFlat) {
        this.selfOwnedFlat = selfOwnedFlat;
    }

    public Property(RentOfFlat rentOfFlat, SelfOwnedFlat selfOwnedFlat) {
        this.rentOfFlat = rentOfFlat;
        this.selfOwnedFlat = selfOwnedFlat;
    }
}
