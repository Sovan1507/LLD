package Parking_Spot.payment;

import Parking_Spot.ticket.Ticket;

public interface IPricingStrategy {

    int calculatePrice(Ticket ticket);

}
