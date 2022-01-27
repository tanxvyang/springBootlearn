package com.txymybatis.pojo;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName customerForm.java
 * @Description TODO
 * @createTime 2021年12月29日 11:07:00
 */
public class CustomerForm {
    private String uuid;
    private Integer status;//状态
    private String businessLicense;//营业执照
    private String customerName;//客户名称
    private String contact;//联系人
    private String phone;//电话
    private String address; //地址

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
