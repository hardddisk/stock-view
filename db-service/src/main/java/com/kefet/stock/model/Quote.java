/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kefet.stock.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author hardddisk
 */

@Entity
@Table(name = "QUOTES", catalog = "test")
public class Quote implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "USER_NAME")
    private String userName;
    
    
    @Column(name = "QUOTE")
    private String quote;
    
    
    public Quote(){}
    
    
    public Quote(Integer id, String userName, String quote){
        this.id=id;
        this.userName=userName;
        this.quote=quote;
    }

    public Quote(String userName, String quote) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return the quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     * @param quote the quote to set
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }
    
}
