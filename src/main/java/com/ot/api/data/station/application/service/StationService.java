package com.ot.api.data.station.application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ot.api.data.station.domain.response.StationResponseDto;
import com.ot.api.data.station.infrastructure.repository.StationRepository;

@Service
public class StationService {

  @Autowired
  private StationRepository stationRepository;
  
  public List<StationResponseDto> getAllStation() {
    
    
    return null;
  }
  
}
