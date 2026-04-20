package com.Blockchaine.Satochi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Blockchaine.Satochi.model.Currency;

import java.math.BigDecimal;
import java.util.List;



public interface CurrencyDao extends JpaRepository<Currency, Integer> {

    Currency findById(int id);
    List<Currency> findByquantiteDetenueGreaterThan(BigDecimal quantiteDetenue);
}
