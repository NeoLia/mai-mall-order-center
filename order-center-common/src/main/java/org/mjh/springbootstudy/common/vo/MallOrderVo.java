package org.mjh.springbootstudy.common.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.mjh.springbootstudy.common.po.MallOrder;

import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/18 0:31
 */
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MallOrderVo {
    private String orderNo;

    private LocalDate orderDate;

    private Long createAt;

    private String createBy;

    private Long updateAt;

    private String updateBy;

    public static MallOrderVo toVo(MallOrder mallOrder) {
        MallOrderVo mallOrderVo = new MallOrderVo();
        mallOrderVo.setOrderNo(mallOrder.getOrderNo());
        mallOrderVo.setOrderDate(mallOrder.getOrderDate());
        mallOrderVo.setCreateAt(mallOrder.getCreateAt().toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        mallOrderVo.setCreateBy(mallOrder.getCreateBy());
        mallOrderVo.setUpdateAt(mallOrder.getUpdateAt().toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        mallOrderVo.setUpdateBy(mallOrder.getUpdateBy());
        return mallOrderVo;
    }
}
