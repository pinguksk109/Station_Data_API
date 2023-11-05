package com.ot.api.data.station.infrastructure.repository;

import java.io.IOException;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.ot.api.data.station.exception.ApiResponseException;
import com.ot.api.data.station.infrastructure.response.StationEntity;

@Repository
public class StationRepository {

  public List<StationEntity> getAllStation() throws IOException, ApiResponseException{
    
    // HttpClientオブジェクトを作成
    HttpRequestFactory factory = (new NetHttpTransport()).createRequestFactory();
    
    GenericUrl genericUrl = new GenericUrl("http://localhost:8080/company");
    
    HttpRequest request = factory.buildGetRequest(genericUrl);
    
    request.setThrowExceptionOnExecuteError(false);
    
    request.setConnectTimeout(30 * 1000);
    request.setReadTimeout(60 * 1000);
    
    HttpHeaders headers = request.getHeaders();
    
    headers.set("Content-Language", "ja");
    headers.set("Content-Type", "application/json; charset=utf-8");
    
    request.setHeaders(headers);
    
    // レスポンス文字列だけ取得して接続を切断
    HttpResponse response = request.execute();
    int statusCode = response.getStatusCode();
    String responseBody = response.parseAsString();
    response.disconnect();
    
    // Listのパース処理どうする？
//    List<StationEntity> entity = new 
    
    if(!HttpStatus.valueOf(statusCode).is2xxSuccessful()) {
      throw new ApiResponseException("駅データ取得で失敗しました");
    }
  }
  
}
