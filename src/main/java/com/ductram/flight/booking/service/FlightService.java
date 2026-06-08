package com.ductram.flight.booking.service;

import com.ductram.flight.booking.entity.FlightEntity;

import java.util.List;

public interface FlightService {
  List<FlightEntity> flights(int page, int size);
}
