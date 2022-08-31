package com.medicare.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author labuser
 *
 */
@Entity
@Table(name = "Medicine")
public class Medicine {

    @Id
    @Column(name = "medicine_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicineId;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "brand")
    private String medicineBrand;

    @Column(name = "price")
    private double medicinePrice;

    @Column(name="quantity")
    private int quantity;

    @Column(name = "manufacturing_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date manufacturingDate;

    @Column(name = "expiry_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date expiryDate;

    @Column(name = "medicine_description")
    private String description;

	public Medicine(int medicineId, String medicineName, String medicineBrand, double medicinePrice, int quantity,
			Date manufacturingDate, Date expiryDate, String description) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineBrand = medicineBrand;
		this.medicinePrice = medicinePrice;
		this.quantity = quantity;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.description = description;
	}

	public Medicine() {
		super();
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineBrand() {
		return medicineBrand;
	}

	public void setMedicineBrand(String medicineBrand) {
		this.medicineBrand = medicineBrand;
	}

	public double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicineBrand="
				+ medicineBrand + ", medicinePrice=" + medicinePrice + ", quantity=" + quantity + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", description=" + description + "]";
	}
    
    
}
