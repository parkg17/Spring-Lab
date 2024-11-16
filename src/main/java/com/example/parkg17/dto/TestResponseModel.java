package com.example.parkg17.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestResponseModel {
    private String name;
    private Long id;
}
