package com.i;

interface Parkable {
    void park();
    void unpark();
}


interface Ticketable {
    void generateTicket();
    double calculateParkingFee();
}


class Car implements Parkable, Ticketable {
    @Override
    public void park() {
        System.out.println("Car parked in its designated spot.");
    }

    @Override
    public void unpark() {
        System.out.println("Car unparked and ready to go.");
    }

    @Override
    public void generateTicket() {
        System.out.println("Ticket generated for car parking.");
    }

    @Override
    public double calculateParkingFee() {
       
        return 15.0;
    }
}


class ParkingLot {
    
    public void parkVehicle(Parkable vehicle) {
        vehicle.park();
    }
    
   
    public void unparkVehicle(Parkable vehicle) {
        vehicle.unpark();
    }
    
    
    public void processTicket(Ticketable vehicle) {
        vehicle.generateTicket();
        System.out.println("Parking fee: $" + vehicle.calculateParkingFee());
    }
}

