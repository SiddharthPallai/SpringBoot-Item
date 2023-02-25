package com.epicminds.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sidharth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    int statusCode;
    String message;
}
