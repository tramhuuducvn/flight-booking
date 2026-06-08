package com.ductram.flight.booking.service.impl;

import com.ductram.flight.booking.entity.FlightEntity;
import com.ductram.flight.booking.repository.FlightRepository;
import com.ductram.flight.booking.service.FlightService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class FlightServiceImpl implements FlightService {
  private final FlightRepository repository;

  public FlightServiceImpl(FlightRepository repository) {
    this.repository = repository;
  }

  public List<FlightEntity> flights(int page, int size) {
    Pageable pageable = PageRequest.of(page, size);
    return StreamSupport.stream(repository.findAll(pageable).spliterator(), false).toList();
  }
}
