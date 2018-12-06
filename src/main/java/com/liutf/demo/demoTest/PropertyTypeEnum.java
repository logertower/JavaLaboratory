package com.liutf.demo.demoTest;

/**
 * 积分变化枚举
 *
 * @author ltf
 * @create 2017-08-23 下午 8:49
 **/
public enum PropertyTypeEnum {

    RED_BAG_GOODS(1, "实物红包"),
    PRIVILEGE_OF_GOLD(2, "特权包"),
    HELP_RIGHT(3,"助力权益"),
    SURFING_OF_GOLD(4,"体验金"),
    PRIVILEGE_OF_GOLD_SUPERSCRIPT(5, "新客特权金角标"),
    PRIVILEGE_BAG_OF_GOLD_SUPERSCRIPT(6, "老客特权包角标"),
    HELP_RIGHT_SUPERSCRIPT(7, "助力权益角标"),
    PRIVILEGE_GOLD(8, "特权金");

    private Integer type;
    private String name;

    PropertyTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 通过type获取枚举
     *
     * @param type
     * @return
     */
    public static PropertyTypeEnum getCustomerNewsType(Integer type) {
        for (PropertyTypeEnum customerNewsTypeEnum : PropertyTypeEnum.values()) {
            if (customerNewsTypeEnum.getType().equals(type)) {
                return customerNewsTypeEnum;
            }
        }
        return null;
    }
}
