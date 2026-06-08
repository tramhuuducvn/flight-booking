package com.ductram.flight.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

@Entity
@Table(name = "flight")
public class FlightEntity {
  @Id
  @Column(name = "flight_id")
  private Integer id;

  @Column(name = "flightno")
  private String flightNumber;
  private Integer from;
  private Integer to;
  private OffsetDateTime departure;
  private OffsetDateTime arrival;

  //  private Integer airlineId;
  //  private Integer airplaneId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public OffsetDateTime getDeparture() {
    return departure;
  }

  public void setDeparture(OffsetDateTime departure) {
    this.departure = departure;
  }

  public OffsetDateTime getArrival() {
    return arrival;
  }

  public void setArrival(OffsetDateTime arrival) {
    this.arrival = arrival;
  }
}
