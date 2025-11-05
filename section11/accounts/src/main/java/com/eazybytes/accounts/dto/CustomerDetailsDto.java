package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Account, Cards and Loans information"
)
public class CustomerDetailsDto {

    @Schema(
            description = "Name of the customer", example = "Naz Don"
    )
    @NotEmpty(message = "None can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;


    @Schema(
            description = "Email address of the customer", example = "hemachael18@gmail.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;


    @Schema(
            description = "Mobile number of the customer", example = "08193859459"
    )
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile number must be 11 digits")
    private String mobileNumber;


    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Loan details of the customer"
    )
    private LoansDto loansDto;


    @Schema(
            description = "Card details of the customer"
    )
    private CardsDto cardsDto;
}
