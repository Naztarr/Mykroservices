package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "cards",
        description = "Schema to hold card information"
)
@Data
public class CardsDto {

    @NotEmpty(message = "Mobile number must be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile number must be 11 digits")
    @Schema(
            description = "Mobile number of customer", example = "08034782576"
    )
    private String mobileNumber;


    @NotEmpty(message = "Card number must be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card number must be 12 digits")
    @Schema(
            description = "Card number of customer", example = "356834782576"
    )
    private String cardNumber;

    @NotEmpty(message = "Card type must be a null or empty")
    @Schema(
            description = "Card type of customer", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be  greater than zero")
    @Schema(
            description = "Total amount limit available against a card", example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal to or greater than zero")
    @Schema(
            description = "Total amount used by a customer", example = "12000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal to or greater than zero")
    @Schema(
            description = "Total available amount against a card", example = "260000"
    )
    private int availableAmount;

}
