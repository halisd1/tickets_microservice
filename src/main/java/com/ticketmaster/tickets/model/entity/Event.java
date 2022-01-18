package com.ticketmaster.tickets.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "events")
public class Event {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  private Date date;

//  @OneToMany(mappedBy="event")
//  private Set<Ticket> ticket;
}
