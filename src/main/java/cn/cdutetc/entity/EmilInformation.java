package cn.cdutetc.entity;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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
