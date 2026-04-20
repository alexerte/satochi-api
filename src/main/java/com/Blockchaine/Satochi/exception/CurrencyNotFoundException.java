package com.Blockchaine.Satochi.exception;

public class CurrencyNotFoundException extends RuntimeException {
    public CurrencyNotFoundException(int id) {
        super("Currency avec id " + id + " introuvable");
    }
}
