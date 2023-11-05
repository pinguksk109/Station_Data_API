package com.ot.api.data.station.infrastructure.response;

import lombok.Data;

@Data
public class StationEntity {

  private Integer station_cd;
  private Integer station_g_cd;
  private String station_name;
  private String station_name_k;
  private Integer line_cd;
  private Integer pref_cd;
  private String post;
  private String address;
  private String lon;
  private String lat;
  private String open_ymd;
  private String close_ymd;
  private Integer e_status;
  private Integer e_sort;
  
}
