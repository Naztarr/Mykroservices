package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold loan information"
)
@Data
public class LoansDto {
    @NotEmpty(message = "mobile number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "mobile number must be 11 digits")
    @Schema(
            description = "Mobile number of customer", example = "08058457399"
    )
    private String mobileNumber;

    @NotEmpty(message = "mobile number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "loan number must be 12 digits")
    @Schema(
            description = "Loan number of the customer", example = "749375938492"
    )
    private String loanNumber;

    @NotEmpty(message = "mobile number can not be a null or empty")
    @Schema(
            description = "Type of the loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "total loan must be greater than zero")
    @Schema(
            description = "total loan amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "amount paid must be equal to or greater than zero")
    @Schema(
            description = "total loan amount paid", example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "outstanding amount must be equal to or greater than zero")
    @Schema(
            description = "total outstanding amount against a loan", example = "99000"
    )
    private int outstandingAmount;


}
