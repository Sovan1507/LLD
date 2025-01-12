package Parking_Spot.payment;

import Parking_Spot.ticket.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

public abstract class PricingStrategy implements IPricingStrategy {

    int base_price;

    public PricingStrategy(int price) {
        this.base_price = price;
    }

    @Override
    public int calculatePrice(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
        Duration duration = Duration.between(ticket.getExitTime(), ticket.getEntryTime());
        // suppose we have
    }
}
