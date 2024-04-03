package cn.cdutetc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmilInformation implements Serializable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 电话
     */
    private String phone;

    /**
     * 预留字段1
     */
    private String test1;

    /**
     * 预留字段2
     */
    private String test2;

    /**
     * 预留字段3
     */
    private String test3;
}
