package com.facebook.abc.gtl.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTablesDemo {

    @Given("I create data")
    public void i_create_data(DataTable dataTable) {
        List<String> data = dataTable.asList();
//        for(String x : data) {
//            System.out.println(x);
//        }
        System.out.println(data.get(2));
    }

    @Given("I create lists")
    public void i_create_lists(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();

        System.out.println(data.get(2).get(1));
    }

    @Given("I create map")
    public void i_create_map(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        System.out.println(data.get("fruit"));
        System.out.println(data.get("veggie"));
        System.out.println(data.get("berry"));
    }

    @Given("I create maps")
    public void i_create_maps(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
//        for(int i=0; i<data.size(); i++) {
//            driver.findElement(xpath[i]).sendKeys(data.get(i).get("fruit"));
//
//        }

        for(Map<String, String> map : data) {
            map.get("veggie");
        }

    }





}
