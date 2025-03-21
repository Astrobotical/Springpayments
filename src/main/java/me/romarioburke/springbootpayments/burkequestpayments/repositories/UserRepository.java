package me.romarioburke.springbootpayments.burkequestpayments.repositories;

import me.romarioburke.springbootpayments.burkequestpayments.payloadRequests.RegistrationRequest;

public interface UserRepository {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
    void createUser(RegistrationRequest registerRequest);
    boolean sendPasswordResetEmail(String email);
    boolean verifyPasswordResetToken(String token);
    boolean resetPassword(String token, String newPassword);
}
