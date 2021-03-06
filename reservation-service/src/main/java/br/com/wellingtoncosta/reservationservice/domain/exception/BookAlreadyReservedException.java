package br.com.wellingtoncosta.reservationservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Wellington Costa on 11/12/18
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookAlreadyReservedException extends RuntimeException {

    public BookAlreadyReservedException(Long bookId) {
        super("Already exists an active reservation for the book with identifier " + bookId + ".");
    }

}
