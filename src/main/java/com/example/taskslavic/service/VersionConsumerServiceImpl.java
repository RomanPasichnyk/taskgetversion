package com.example.taskslavic.service;

import com.example.taskslavic.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VersionConsumerServiceImpl implements VersionConsumerService {

    private static final String ENDPOINT_URL = "https://ww2staging.slavic401k.com/swal/version";

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseModel getVersion() {
        ResponseEntity<ResponseModel> response = restTemplate.getForEntity(ENDPOINT_URL, ResponseModel.class);
        return response.getBody();
    }

}
