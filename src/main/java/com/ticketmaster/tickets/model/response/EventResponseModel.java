package com.ticketmaster.tickets.model.response;

import com.ticketmaster.tickets.model.entity.Ticket;

import java.util.Date;

public class EventResponseModel {
  private String eventName;
  private Date eventDate;
  private Ticket[] tickets;
}
