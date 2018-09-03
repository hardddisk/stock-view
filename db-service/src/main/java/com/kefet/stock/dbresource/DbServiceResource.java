/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kefet.stock.dbresource;

import com.kefet.stock.model.Quote;
import com.kefet.stock.model.Quotes;
import com.kefet.stock.repository.QuotesRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardddisk
 */

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {
    
    @Autowired
    private QuotesRepository quotesRepository;
    
    @GetMapping("/{username}")
    public List<String> getQuetes(@PathVariable("username") 
                                    final String username){
        
        return getQuotesByUserName(username);
        
    }
    
    
    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quotes){
        
        quotes.getQuotes()
                .stream()
                .map(quote -> new Quote(quotes.getUserName(), quote))
                .forEach(quote -> quotesRepository.save(quote));
        
        return getQuotesByUserName(quotes.getUserName());
    }
    
    
    
    private List<String> getQuotesByUserName(@PathVariable("username") String username){
        
        return quotesRepository.findByUserName(username)
                .stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }
    
    
    
}
