package com.blog.common;

/**
 *返回参数错误码枚举
 */
public enum ResultStatus {

    SUCCESS(200, "success"), //成功

    ERROR(4000, "Error"),       //程序报错

    INVALID_SERVICE(199, "invalid service"),//服务不可用

    SERVICE_EXCEPTION(5000, "service exception"),

    UNKNOWN(999, "unknown"),//未知错误

    //搜索结果不存在
    USER_NOT_EXISTS(1401, "user not exists"),
    PERMISSION_DENIED(1402,"permission denied"),
    ARTICLE_NOT_EXIST(1403,"article not exist"),
    ARTICLE_HAS_BEEN_DELETED(1403,"article has been deleted"),
    //参数类型缺失
    PARAMETER_ILLEGAL(1501, "parameter illegal");

    private final int value;

    private final String reasonPhrase;

    private ResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }


    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }


}
