package org.mjh.springbootstudy.common.enums;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 23:14
 */
public enum BaseResultCodeEnum implements ResultCodeAction {
    SUCCESS("0", "Success"),
    FAILURE("-1", "Failure");

    private String code;
    private String description;

    BaseResultCodeEnum(String code, String description) {
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
