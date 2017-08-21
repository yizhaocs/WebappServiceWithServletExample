package com.yizhao.apps.service;


import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * Created by yzhao on 8/21/17.
 */
public class DoSomethingServiceImpl implements DoSomethingService{
    private static final Logger log = Logger.getLogger(DoSomethingServiceImpl.class);

    private String somethingValue;
    private List<String> somethingList;
    private Map<String, String> somethingMap;

    public void init(){
        System.out.println("[DoSomethingServiceImpl.init] ");
        System.out.println("[DoSomethingServiceImpl.init] somethingValue:" + somethingValue);
        System.out.println("[DoSomethingServiceImpl.init] somethingList:" + somethingList);
        System.out.println("[DoSomethingServiceImpl.init] somethingMap:" + somethingMap);
    }

    public void destroy(){
        System.out.println("destory something");
    }

    public void find() throws Exception{
        System.out.println("find something");
    }
    public void create() throws Exception{
        System.out.println("create something");
    }

    public String getSomethingValue() {
        return somethingValue;
    }

    public void setSomethingValue(String somethingValue) {
        this.somethingValue = somethingValue;
    }

    public List<String> getSomethingList() {
        return somethingList;
    }

    public void setSomethingList(List<String> somethingList) {
        this.somethingList = somethingList;
    }

    public Map<String, String> getSomethingMap() {
        return somethingMap;
    }

    public void setSomethingMap(Map<String, String> somethingMap) {
        this.somethingMap = somethingMap;
    }
}
