package  ticket.redeemed_tickets;

import  ticket.ticket;

public class redeemed_tickets extends ticket {
    int redeemed_tickets;
    public redeemed_tickets(){
        super();
    }

    public redeemed_tickets(int ticket_id, String type, int id, String from, String direction, String to,
            int redeemed_tickets) {
        super(ticket_id, type, id, from, direction, to);
        this.redeemed_tickets = redeemed_tickets;
    }

    public redeemed_tickets(int redeemed_tickets_Id, String type, int routesId, int redeemed_tickets) {
        super(redeemed_tickets_Id, type, routesId);
        this.redeemed_tickets = redeemed_tickets;
    }

    public int getRedeemed_tickets() {
        return redeemed_tickets;
    }

    public void setRedeemed_tickets(int redeemed_tickets) {
        this.redeemed_tickets = redeemed_tickets;
    }
}
