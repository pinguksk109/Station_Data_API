package com.ot.api.data.station.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ot.api.data.station.application.service.StationService;

@RestController
@RequestMapping("/")
public class StationController {

  @Autowired
  private StationService stationService;
  
  @GetMapping("station")
  public ResponseEntity<?> getAllStation() {
    return null;
  }
  
}
