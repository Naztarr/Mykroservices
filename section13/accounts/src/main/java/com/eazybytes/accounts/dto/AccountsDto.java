package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Naztar Bank account", example = "3738645272"
    )
    private Long accountNumber;



    @NotEmpty(message = "Account type can not be a null or empty")
    @Schema(
            description = "Account type of Naztar Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address can not be a null or empty")
    @Schema(
            description = "Naztar Bank branch address", example = "Orchid road, Peninsula II, Lekki, Lagos. "
    )
    private String branchAddress;
}
