package com.yizhao.apps.service;


import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by yzhao on 8/21/17.
 */
public class DoSomethingServiceImpl implements DoSomethingService{
    private static final Logger log = Logger.getLogger(DoSomethingServiceImpl.class);

    private List<String> somethingList;

    public void init(){
        System.out.println("init something");
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

    public List<String> getSomethingList() {
        return somethingList;
    }

    public void setSomethingList(List<String> somethingList) {
        this.somethingList = somethingList;
    }
}
