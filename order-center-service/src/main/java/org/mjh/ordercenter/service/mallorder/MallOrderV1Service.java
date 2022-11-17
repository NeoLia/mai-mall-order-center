package org.mjh.ordercenter.service.mallorder;

import org.mjh.springbootstudy.common.enums.OrderResultCodeEnum;
import org.mjh.springbootstudy.common.po.MallOrder;
import org.mjh.springbootstudy.common.vo.BaseResult;
import org.mjh.springbootstudy.common.vo.MallOrderVo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/18 0:57
 */
@Service
public class MallOrderV1Service {
    private static HashMap<String, MallOrder> mallOrderHashMap = new HashMap<>(1);

    @PostConstruct
    private void init() {
        String orderNo = "20221117000001";
        LocalDate orderDate = LocalDate.of(2022, 11, 17);
        LocalDateTime nowDateTime = LocalDateTime.now();
        MallOrder mallOrder = new MallOrder();
        mallOrder.setOrderNo(orderNo);
        mallOrder.setOrderDate(orderDate);
        mallOrder.setCreateAt(nowDateTime);
        mallOrder.setCreateBy("admin");
        mallOrder.setUpdateAt(nowDateTime);
        mallOrder.setUpdateBy("admin");
        mallOrderHashMap.put(orderNo, mallOrder);
    }

    /**
     * Get mall order by order no.
     * @param orderNo - Order no.
     * @return BaseResult<MallOrder> - Return a BaseResult object.
     */
    public BaseResult<MallOrderVo> getMallOrderByOrderNo(String orderNo) {
        MallOrder mallOrder = mallOrderHashMap.get(orderNo);
        if (mallOrder == null) {
            return BaseResult.fail(OrderResultCodeEnum.ORDER_EMPTY_QUERY_RESULT);
        }

        MallOrderVo mallOrderVo = MallOrderVo.toVo(mallOrder);
        return BaseResult.success(OrderResultCodeEnum.ORDER_SUCCESS, mallOrderVo);
    }
}
