/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kefet.stock.model;

import java.util.List;

/**
 *
 * @author hardddisk
 */
public class Quotes {
 
    private String userName;
    private List<String> quotes;
    
    
    public Quotes(){
        
    }
    
    public Quotes(String userName, List<String> quotes){
        this.userName=userName;
        this.quotes=quotes;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the quotes
     */
    public List<String> getQuotes() {
        return quotes;
    }

    /**
     * @param quotes the quotes to set
     */
    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
    
    
}
