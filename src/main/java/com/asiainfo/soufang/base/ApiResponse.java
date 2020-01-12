package com.asiainfo.soufang.base;

/**
 * @author qml
 * @date 2020/1/12 0012 13:49
 */
public class ApiResponse {
    private int code;
    private String message;
    private Object data;
    private boolean more;

    public ApiResponse() {
        this.code=Status.SUCCESS.getCode();
        this.message=Status.SUCCESS.getStandardMessage();
    }

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public static ApiResponse ofMessage(int code,String message){
        return new ApiResponse(code,message,null);
    };

    public static ApiResponse ofSuccess(Object data){
        return new ApiResponse(Status.SUCCESS.getCode(),Status.SUCCESS.getStandardMessage(),data);
    }

    public static ApiResponse ofStatus(Status status){
        return new ApiResponse(status.getCode(),status.getStandardMessage(),null);
    }

    public enum Status{
        SUCCESS(200,"ok"),
        BAD_REQUEST(400,"Bad Request"),
        NOT_FOUND(404,"Not Found"),
        INTERNAL_SERVER_ERROR(500,"unknown Internal error"),
        NOT_VALID_PARAM(40005, "Not valid Params"),
        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),
        NOT_LOGIN(50000, "Not Login");


        private int code;
        private String standardMessage;

        Status(int code, String standardMessage) {
            this.code=code;
            this.standardMessage=standardMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }
}
