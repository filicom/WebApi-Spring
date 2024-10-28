package filicom.web_api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error; 


    // Getter para timestamp
    public Date getTimestamp() {
        return timestamp;
    }

    // Setter para status
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter para status
    public String getStatus() {
        return status;
    }

    // Getter para statusCode
    public int getStatusCode() {
        return statusCode;
    }

    // Setter para statusCode
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    // Getter para error
    public String getError() {
        return error;
    }

    // Setter para error
    public void setError(String error) {
        this.error = error;
    }
}
