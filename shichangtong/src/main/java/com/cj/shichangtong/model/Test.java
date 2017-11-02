package com.cj.shichangtong.model;

import javax.persistence.*;

public class Test extends BaseEntity {
   

    private String name;

    @Column(name = "test_name")
    private String testName;

   
    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return test_name
     */
    public String getTestName() {
        return testName;
    }

    /**
     * @param testName
     */
    public void setTestName(String testName) {
        this.testName = testName;
    }
}