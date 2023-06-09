package id.co.travel.travelnotif.exception;

import lombok.Getter;

@Getter
public class CustomException extends Exception{
    private String errorMessage;

    public CustomException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
