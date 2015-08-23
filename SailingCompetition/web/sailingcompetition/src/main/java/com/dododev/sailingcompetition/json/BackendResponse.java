package com.dododev.sailingcompetition.json;

import com.dododev.sailingcompetition.dict.BackendResponseStatus;

/**
 * @author dodo
 */
public class BackendResponse {

    private BackendResponseStatus status;
    private String errorDescription;
    private Object result;

    public BackendResponseStatus getStatus() {
        return status;
    }

    public void setStatus(BackendResponseStatus status) {
        this.status = status;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
