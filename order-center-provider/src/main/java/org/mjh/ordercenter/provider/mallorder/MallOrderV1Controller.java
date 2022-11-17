package org.mjh.ordercenter.provider.mallorder;

import org.mjh.ordercenter.service.mallorder.MallOrderV1Service;
import org.mjh.springbootstudy.common.vo.BaseResult;
import org.mjh.springbootstudy.common.vo.MallOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 22:59
 */
@RequestMapping("/v1/order")
@RestController
public class MallOrderV1Controller {
    @Autowired
    private MallOrderV1Service mallOrderV1Service;

    /**
     * Get mall order by order no.
     * @param orderNo - Order no.
     * @return BaseResult<MallOrderVo> - Return a BaseResult object.
     */
    @GetMapping("/orderNo/{orderNo}")
    public BaseResult<MallOrderVo> getMallOrderByOrderNo(@PathVariable("orderNo") String orderNo) {
        return mallOrderV1Service.getMallOrderByOrderNo(orderNo);
    }
}
