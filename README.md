# Bet-Service-with-Java-SpringBoot
Bet service with java springboot and mssql running on Docker


# 🎰 Wager API

Wager API is a backend service built with Java Spring Boot and Docker Compose. It provides RESTful endpoints for managing jackpots and placing bets, backed by a SQL Server database.

---

## How to Build and Run Locally

### 🔧 Prerequisites

- Java 17+
- Maven
- Docker Desktop (with virtualization enabled)

### Build the Project

```bash
mvn clean package -DskipTests
```

### Run with Docker
```bash
cd docker-compose
docker compose up --build
```


## API Endpoints
### Create a Jackpot

POST /api/jackpots

Request:

{
  "name": "Mega Jackpot",
  "amount": 1000.0
}

Response:

{
  "id": 1,
  "name": "Mega Jackpot",
  "amount": 1000.0
}

### Place a Bet

POST /api/bets

Request:

{
  "jackpotId": 1,
  "playerAlias": "eren",
  "amount": 50.0
}

Response:

{
  "id": 101,
  "jackpotId": 1,
  "playerAlias": "eren",
  "amount": 50.0,
  "timestamp": "2025-10-01T22:00:00"
}

### Get All Jackpots

GET /api/jackpots

Response:

[
  {
    "id": 1,
    "name": "Mega Jackpot",
    "amount": 1000.0
  },
  {
    "id": 2,
    "name": "Mini Jackpot",
    "amount": 500.0
  }
]

### Get All 

GET /api/jackpots

Response:

[
  {
    "id": 1,
    "name": "Mega Jackpot",
    "amount": 1000.0
  },
  {
    "id": 2,
    "name": "Mini Jackpot",
    "amount": 500.0
  }
]




