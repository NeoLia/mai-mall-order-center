package org.mjh.springbootstudy.common.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mjh.springbootstudy.common.enums.ResultCodeAction;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 23:08
 */
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BaseResult<T> {
    private String code;
    private String message;
    private Boolean success;
    private T data;

    /**
     * Generate a success base result.
     * @param resultCodeAction - Result code
     * @param <T> - Business data type
     * @return - Return a new BaseResult object.
     */
    public static <T> BaseResult<T> success(ResultCodeAction resultCodeAction) {
        return new BaseResult<>(
                resultCodeAction.getCode(),
                resultCodeAction.getDescription(),
                true,
                null
        );
    }

    /**
     * Generate a success base result.
     * @param resultCodeAction - Result code
     * @param data - Business data
     * @param <T> - Business data type
     * @return
     */
    public static <T> BaseResult<T> success(ResultCodeAction resultCodeAction, T data) {
        return new BaseResult<>(
                resultCodeAction.getCode(),
                resultCodeAction.getDescription(),
                true,
                data
        );
    }

    /**
     * Generate a failure base result.
     * @param resultCodeAction - Result code
     * @param <T> - Business data type
     * @return
     */
    public static <T> BaseResult<T> fail(ResultCodeAction resultCodeAction) {
        return new BaseResult<>(
                resultCodeAction.getCode(),
                resultCodeAction.getDescription(),
                false,
                null
        );
    }
}
