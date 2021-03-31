package com.example.taskslavic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Serialization
public class ResponseModel {

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Timestamp")
    private String timestamp;

    @JsonProperty("Name")
    private String name;
}
