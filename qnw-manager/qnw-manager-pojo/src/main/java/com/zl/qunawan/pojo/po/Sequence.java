package com.zl.qunawan.pojo.po;

public class Sequence {
    private Integer id;

    private String value;

    private String keying;

    private String type;

    private String descing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getKeying() {
        return keying;
    }

    public void setKeying(String keying) {
        this.keying = keying == null ? null : keying.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescing() {
        return descing;
    }

    public void setDescing(String descing) {
        this.descing = descing == null ? null : descing.trim();
    }
}