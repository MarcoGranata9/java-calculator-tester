package org.learning.ticket;

public class Ticket {
    int km;
    int age;

    double discount = 0;

    public Ticket(int km, int age) throws IllegalArgumentException{
        this.km = validatePositiveNum(km);
        this.age = validatePositiveNum(age);

        if (age >= 65) {
            discount = 0.40;
        } else if (age < 18) {
            discount = 0.20;
        }
    }

    private int validatePositiveNum(int num) throws IllegalArgumentException{
        if (num < 0) {
            throw new IllegalArgumentException("The number cannot be negative");
        }
        return num;
    }

    public double getTicketPrice() {
        double ticketPriceKm = 0.21;
        double totPrice = km * ticketPriceKm;
        if (discount != 0) {
            totPrice = km * ticketPriceKm - (totPrice * discount);
        }
        return totPrice;
    }
}
