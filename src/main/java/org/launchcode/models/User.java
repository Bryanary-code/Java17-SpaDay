package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Username cannot be blank.")
    @Size(message = "Username must be between 5 and 15 characters.")
    private String userName;

    @Email(message = "Invalid email. Try again.")
    private String email;
    @NotBlank(message = "Please enter a password.")
    @Size(min = 6, message = "Password must be at least 8 characters.")
    private String password;
    private int ID;

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
