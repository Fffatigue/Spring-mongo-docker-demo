package ru.nsu.fit.g20221.chmil.controller.user;

class UserNotFoundException extends RuntimeException {

    UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}
