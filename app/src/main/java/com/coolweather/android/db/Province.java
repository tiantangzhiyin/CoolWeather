package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
//LitePal的每个实体类都要继承自DataSupport类
public class Province extends DataSupport{

    private int id;
    private String provinceName;//省份名字
    private int provinceCode; //省份代号

    public void setId(int id) {
        this.id = id;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {

        return id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
}
