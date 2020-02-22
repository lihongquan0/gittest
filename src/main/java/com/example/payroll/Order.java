package com.example.payroll;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CUSTOMER_ORDER")
class Order {

  private @Id @GeneratedValue Long id;

  private String description;
  private Status status;

  Order() {}

  Order(String description, Status status) {

    this.description = description;
    this.status = status;
  }
  
  public void setStatus(Status status) {
	  this.status = status;
  }
  
  public Status getStatus() {
	  return this.status;
  }
}