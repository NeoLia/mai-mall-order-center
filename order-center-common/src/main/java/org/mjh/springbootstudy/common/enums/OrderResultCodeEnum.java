package org.mjh.springbootstudy.common.enums;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 23:20
 */
public enum OrderResultCodeEnum implements ResultCodeAction {
    ORDER_SUCCESS("1000", "Success"),
    ORDER_ILLEGAL_REQUEST_PARAM("1001", "Illegal request parameters"),
    ORDER_EMPTY_QUERY_RESULT("1002", "Empty query result");

    private String code;
    private String description;

    OrderResultCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
