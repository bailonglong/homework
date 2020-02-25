package com.bw.jcart_administration_back.dto.in;

public class ProductSearchInDTO {
    private String productCode;
    private String productName;
    private Double price;
    private Integer stockQuantity;
    private Byte status;
    private Integer pageNum;
    public ProductSearchInDTO(String productCode, String productName, Double price, Integer stockQuantity, Byte status) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.status = status;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
