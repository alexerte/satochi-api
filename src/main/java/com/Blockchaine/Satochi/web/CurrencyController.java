package com.Blockchaine.Satochi.web;

import com.Blockchaine.Satochi.dao.CurrencyDao;
import com.Blockchaine.Satochi.exception.CurrencyNotFoundException;
import com.Blockchaine.Satochi.model.Currency;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;



@RestController
@RequestMapping("/Currencies")
@Tag(name = "Currency Controller", description = "Gestion des cryptomonnaies")
public class CurrencyController {

    private final CurrencyDao currencyDao;

    public CurrencyController(CurrencyDao currencyDao) {
        this.currencyDao =currencyDao;
    }
    @Operation(summary = "Récupérer toutes les currencies")
    @GetMapping
    public ResponseEntity<List<Currency>> affichetousCurrency() {
        List<Currency> list = currencyDao.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(list);
    }

    // GET par id → 200 OK ou 404 NOT FOUND
    @Operation(summary = "Récupérer une currency par id")
    @GetMapping("/{id}")
    public ResponseEntity<Currency> afficheCurrency(@PathVariable int id) {
        Currency cur = currencyDao.findById(id);
        if (cur == null) {
            throw new CurrencyNotFoundException(id);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(cur);
    }

    // GET par prix → 200 OK
    @Operation(summary = "Récupérer toutes les currencies leurs quantiteDetenue plus grandes que la quantite entre")
    @GetMapping("/prix/{prixLimit}")
    public ResponseEntity<List<Currency>> afficheprodplusgandque(@PathVariable BigDecimal prixLimit) {
        List<Currency> list = currencyDao.findByquantiteDetenueGreaterThan(prixLimit);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(list);
    }

    // POST → 201 CREATED
    @Operation(summary = "Ajouter une currency")
    @PostMapping
    public ResponseEntity<Currency> ajoutproduit(@Valid @RequestBody Currency cur) {
        Currency saved = currencyDao.save(cur);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Location", "/Currencies/" + saved.getId())
                .body(saved);
    }

    // DELETE → 204 NO CONTENT ou 404 NOT FOUND
    @Operation(summary = "Supprimer une currency")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletproduit(@PathVariable int id) {
        Currency cur = currencyDao.findById(id);
        if (cur == null) {
            throw new CurrencyNotFoundException(id);
        }
        currencyDao.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

    // PUT → 200 OK ou 404 NOT FOUND
    @Operation(summary = "Modifier une currency")
    @PutMapping
    public ResponseEntity<Currency> editproduit(@RequestBody Currency cur) {
        Currency existing = currencyDao.findById(cur.getId());
        if (existing == null) {
            throw new CurrencyNotFoundException(cur.getId());
        }
        Currency updated = currencyDao.save(cur);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(updated);
    }

}