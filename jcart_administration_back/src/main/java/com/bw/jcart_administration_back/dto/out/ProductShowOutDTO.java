package com.bw.jcart_administration_back.dto.out;

import java.util.List;

public class ProductShowOutDTO {
    private Integer productId;
    private String productCode;
    private String productName;
    private Double price;
    private Double discount;
    private Integer stockQuantity;
    private Byte status;
    private String mainPicUrl;
    private Integer rewordPoints;
    private Integer sortOtder;
    private String description;
    private List<String> otherPicUrls;

    public ProductShowOutDTO(Integer productId, String productCode, String productName, Double price, Double discount, Integer stockQuantity, Byte status, String mainPicUrl, Integer rewordPoints, Integer sortOtder, String description, List<String> otherPicUrls) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.stockQuantity = stockQuantity;
        this.status = status;
        this.mainPicUrl = mainPicUrl;
        this.rewordPoints = rewordPoints;
        this.sortOtder = sortOtder;
        this.description = description;
        this.otherPicUrls = otherPicUrls;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public Integer getSortOtder() {
        return sortOtder;
    }

    public void setSortOtder(Integer sortOtder) {
        this.sortOtder = sortOtder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOtherPicUrls() {
        return otherPicUrls;
    }

    public void setOtherPicUrls(List<String> otherPicUrls) {
        this.otherPicUrls = otherPicUrls;
    }
}
