package com.eazybytes.loans.service;


import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {

    /**
     * @Param mobileNumber - Mobile number of the customer
     * */
    void createLoan(String mobileNumber);

    /**
     * @Param mobileNumber - Mobile number of the customer
     * @return loan details based on  given mobile number
     * */
    LoansDto fetchLoan(String mobileNumber);

    /**
     * @Param loansDto - LoansDto Object
     * @return boolean indicating if the update of loan details is successful or not
     * */
    boolean updateLoan(LoansDto loansDto);

    /**
     * @Param mobileNumber - Mobile number of the customer
     * @return boolean indicating if the deletion of loan details is successful or not
     * */
    boolean deleteLoan(String mobileNumber);
}
