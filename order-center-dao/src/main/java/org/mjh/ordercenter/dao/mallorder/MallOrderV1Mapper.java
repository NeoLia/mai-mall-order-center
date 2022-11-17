package org.mjh.ordercenter.dao.mallorder;

import org.mjh.springbootstudy.common.po.MallOrder;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/18 1:19
 */
@Repository
public class MallOrderV1Mapper {
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
     * @return MallOrder - Return a BaseResult object.
     */
    public MallOrder getMallOrderByOrderNo(String orderNo) {
        return mallOrderHashMap.get(orderNo);
    }
}
