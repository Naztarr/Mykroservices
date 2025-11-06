package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;
import org.springframework.stereotype.Service;

public interface ICardsService {

    /**
     *
     * @Params mobileNumber - Mobile number of the customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @Params mobileNumber - Input mobile number
     * @return card details based on a given mobile number
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @Params cardsDto - CardsDto object
     * @return  boolean indicating if the update of card details is successful or not
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     *
     * @Params mobileNumber - Input mobile number
     * @return boolean indicating if the deletion of card details is successful or not
     */
    boolean deleteCard(String mobileNumber);
}
