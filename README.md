# 📦 satochi-api

> REST API de gestion de cryptomonnaies — built with **Spring Boot**, **JPA/Hibernate**, and documented with **Swagger UI (OpenAPI 3.1)**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=flat&logo=swagger&logoColor=black)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white)
![JPA](https://img.shields.io/badge/JPA%2FHibernate-59666C?style=flat&logo=hibernate&logoColor=white)

---

## 🚀 Description

**satochi-api** est une API REST permettant de gérer un portefeuille de cryptomonnaies.  
Elle expose des opérations CRUD complètes sur l'entité `Currency`, avec une gestion d'exceptions personnalisée et une documentation interactive via Swagger UI.

---

## 🛠 Stack technique

| Couche | Technologie |
|--------|-------------|
| Framework | Spring Boot |
| Persistance | JPA / Hibernate |
| Base de données | H2 (in-memory) |
| Documentation | Swagger UI — OpenAPI 3.1 |
| Build | Maven |
| Langage | Java |

---

## ⚙️ Lancer le projet

### Prérequis
- Java 17+
- Maven 3.8+

### Démarrage

```bash
git clone https://github.com/alexerte/satochi-api.git
cd satochi-api
mvn spring-boot:run
```

L'API sera disponible sur : `http://localhost:8080`  
Swagger UI : `http://localhost:8080/swagger-ui.html`

---

## 📡 Endpoints — Currency Controller

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| `GET` | `/Currencies` | Récupérer toutes les currencies |
| `GET` | `/Currencies/{id}` | Récupérer une currency par ID |
| `GET` | `/Currencies/prix/{prixLimit}` | Récupérer les currencies dont la quantité détenue > prixLimit |
| `POST` | `/Currencies` | Ajouter une currency |
| `PUT` | `/Currencies` | Modifier une currency |
| `DELETE` | `/Currencies/{id}` | Supprimer une currency |

---

## 🏗 Architecture

```
src/
├── controller/     → CurrencyController (REST endpoints)
├── service/        → CurrencyService (logique métier)
├── repository/     → CurrencyRepository (Spring Data JPA)
├── entities/       → Currency (entité JPA)
└── exception/      → Gestion d'exceptions custom (@ControllerAdvice)
```

Architecture en couches : **Controller → Service → Repository**

---

## 📸 Swagger UI

![Swagger UI](./swagger-screenshot.png)

---

## 👤 Auteur

**ABBADIA Mouad** — [@alexerte](https://github.com/alexerte)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin)](https://linkedin.com/in/mouad-abbadia)
