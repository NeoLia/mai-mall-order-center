package org.mjh.springbootstudy.common.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 23:38
 */
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MallOrder {
    private String orderNo;

    private LocalDate orderDate;

    private LocalDateTime createAt;

    private String createBy;

    private LocalDateTime updateAt;

    private String updateBy;
}
