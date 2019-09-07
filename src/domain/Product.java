/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author stevokv
 */
public class Product {
    private Long id;
    private String name;
    private String description;
    private Manufacturer manufacturer;
    private MeasurementUnit measurementUnit;
    private BigDecimal price;
    private User userSavedUser;

    public Product() {
    }

    public Product(Long id, String name, String description, Manufacturer manufacturer, MeasurementUnit measurementUnit, BigDecimal price, User userSavedUser) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.measurementUnit = measurementUnit;
        this.price = price;
        this.userSavedUser = userSavedUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public User getUserSavedUser() {
        return userSavedUser;
    }

    public void setUserSavedUser(User userSavedUser) {
        this.userSavedUser = userSavedUser;
    }
    
    
}
