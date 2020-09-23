package edu.szymczak.common.service;

public class LoginOutputDAO {

    private int statusCode;

    private String statusMessage;

    private String sessionHash;

    public LoginOutputDAO(int statusCode, String statusMessage, String sessionHash) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.sessionHash = sessionHash;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getSessionHash() {
        return sessionHash;
    }

    public void setSessionHash(String sessionHash) {
        this.sessionHash = sessionHash;
    }
}