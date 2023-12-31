package br.com.profissaodev.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

    private static final long serialVersionID = 1L;

    public UnsupportedMathOperationException(String ex) {
        super(ex);
    }
}
