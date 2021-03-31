package com.example.taskslavic.controller;

import com.example.taskslavic.model.ResponseModel;
import com.example.taskslavic.service.VersionConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slavic")
@RequiredArgsConstructor
public class TaskController {

    private final VersionConsumerService versionConsumerService;

    @GetMapping("/swal/version")
    public ResponseEntity<ResponseModel> getVersion() {
        return new ResponseEntity<>(versionConsumerService.getVersion(), HttpStatus.OK);
    }

}
