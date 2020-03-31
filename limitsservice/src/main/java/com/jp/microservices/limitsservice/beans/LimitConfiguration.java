package com.jp.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}