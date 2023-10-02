package com.fastapispring.demo.entities;

public class Product {
    private String mane;
    private Long id;  
    private Double pricer;  
    private Department department ;


    public Product(){

    }  
      public Product(String name, Long id, Double pricer, Department department){
        this.id = id;
        this.mane = name;
        this.pricer = pricer;
        this.department = department;
      }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getMane() {
        return mane;
    }
    public void setMane(String mane) {
        this.mane = mane;
    }


    public Double getPricer() {
        return pricer;
    }
    public void setPricer(Double pricer) {
        this.pricer = pricer;
    }


    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }




    
}
