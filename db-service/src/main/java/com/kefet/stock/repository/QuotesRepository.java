/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kefet.stock.repository;

import com.kefet.stock.model.Quote;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hardddisk
 */
public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    
    /**
     *
     * @param userName
     * @return List of Quote
     */
    List<Quote> findByUserName(String userName);
    
}
