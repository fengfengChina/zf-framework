package com.zf.base;

/**
 * Response
 *
 * @author zf
 * @date 16/3/21
 */
public class Response {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private String status;
    private String msg;
    private Object data;

    public Response success() {
        this.status = OK;
        this.msg = OK;
        return this;
    }

    public Response success(Object data) {
        this.status = OK;
        this.msg = OK;
        this.data = data;
        return this;
    }

    public Response failure() {
        this.status = ERROR;
        this.msg = ERROR;
        return this;
    }

    public Response failure(String message) {
        this.status = ERROR;
        this.msg = message;
        return this;
    }


    public Object getData() {
        return data;
    }

}
