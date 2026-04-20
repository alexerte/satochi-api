-- =============================================
-- schema.sql - Création de la table Currency
-- =============================================

DROP TABLE IF EXISTS currency;

CREATE TABLE currency (
                          id                  INTEGER PRIMARY KEY AUTO_INCREMENT,

                          nom                 VARCHAR(100) NOT NULL,
                          symbole             VARCHAR(10)  NOT NULL,
                          quantite_Detenue     DECIMAL(20, 8) NOT NULL,
                          cle_Privee           VARCHAR(255) NOT NULL,

                          CONSTRAINT uk_symbole UNIQUE (symbole)
);

-- Index pour améliorer les performances
CREATE INDEX idx_currency_symbole ON currency(symbole);