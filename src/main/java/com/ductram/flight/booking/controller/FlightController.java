package com.ductram.flight.booking.controller;

import com.ductram.flight.booking.entity.FlightEntity;
import com.ductram.flight.booking.service.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/flights")
public class FlightController {

  private final FlightService flightService;

  public FlightController(FlightService flightService) {
    this.flightService = flightService;
  }

  @GetMapping
  public List<FlightEntity> flights(@RequestParam int page, @RequestParam int size) {
    return flightService.flights(page, size);
  }
}
