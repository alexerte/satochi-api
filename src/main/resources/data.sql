-- =============================================
-- data.sql - Données initiales de test pour Currency
-- =============================================

INSERT INTO currency (nom, symbole, quantite_Detenue, cle_Privee)
VALUES ('Bitcoin', 'BTC', 0.24567890, 'L5k9p2mX7vQ8wR3tY6uZ9xA1bC4dE7fG2hI5jK8lM');

INSERT INTO currency (nom, symbole, quantite_Detenue, cle_Privee)
VALUES ('Ethereum', 'ETH', 3.87500000, '0x8f3a2b7c9d1e4f6a8b2c9d7e5f1a3b6c8d9e0f2a4b');

INSERT INTO currency (nom, symbole, quantite_Detenue, cle_Privee)
VALUES ('Solana', 'SOL', 45.67000000, '5v8x9k2mP7qR4tY6uZ9xA1bC3dE5fG7hI9jK2mN4pQ');

INSERT INTO currency (nom, symbole, quantite_Detenue, cle_Privee)
VALUES ('Binance Coin', 'BNB', 12.45000000, '0x7d4e9f2a6b8c1d3e5f7a9b2c4d6e8f0a1b3c5d7e9f');

INSERT INTO currency (nom, symbole, quantite_Detenue, cle_Privee)
VALUES ('Cardano', 'ADA', 1250.75000000, 'D5fG7hI9jK2mN4pQ6rS8tU0vW2xY4zA6bC8dE0fG2h');

COMMIT;