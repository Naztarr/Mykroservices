package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "Error response",
        description = "Schema to hold error response information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "Api path invoked by the client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error that occurred"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error that occurred"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error occurred"
    )
    private LocalDateTime errorTIme;
}
