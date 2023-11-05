package com.ot.api.data.station.exception;

public class ApiResponseException extends Exception{
  
  private String responseMessage;
  
  public ApiResponseException() {
    super();
  }
  
  public ApiResponseException(String message) {
    super(message);
  }
  
  public ApiResponseException(String message, String responseMessage) {
    super(message);
    this.responseMessage = responseMessage;
  }
  
  public String getResponseMessage() {
    return this.responseMessage;
  }
  
}
