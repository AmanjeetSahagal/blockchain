# Java Crypto Wallet Blockchain Project

## Overview
This project is a **Java-based blockchain and cryptocurrency wallet system** that demonstrates fundamental concepts of decentralized transaction management and cryptographic security. It simulates how transactions are created, verified, and added to a blockchain using **SHA-256 hashing** and **digital signatures** to ensure integrity, authenticity, and non-repudiation.

## Features
- **Blockchain Implementation** — sequentially linked blocks secured by SHA-256 cryptographic hashes.  
- **Transaction Authentication** — each transaction is digitally signed and verified using asymmetric cryptography.  
- **Wallet Generation** — supports creation of unique wallet key pairs for secure identity management.  
- **Transaction Verification** — ensures that only valid and authorized transactions are added to the blockchain.  
- **Console-Based Interface** — allows users to interact with the blockchain by creating wallets, generating transactions, and viewing the chain structure.

## Technologies Used
- **Java (JDK 17 or higher)**  
- **SHA-256 Cryptographic Hash Function**  
- **ECDSA (Elliptic Curve Digital Signature Algorithm)**  
- **Object-Oriented Programming Principles**

## Project Structure
```text
src/
 ├── blockchain/         # Core blockchain logic (Block, Blockchain, Transaction)
 ├── crypto/             # Cryptographic utilities (SHA256, ECDSA)
 ├── wallet/             # Wallet and key management
 └── Main.java           # Application entry point
```
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-crypto-wallet-blockchain.git
   ```
2. Open the project in an IDE such as IntelliJ IDEA or Eclipse.
3. Ensure that JDK 17 or a later version is configured.
4. Compile and execute BlockChain.java to launch the application.
5. Follow the on-screen instructions to generate wallets, create transactions, and view the blockchain.

## Learning Objectives
```markdown
- Demonstrate the use of **cryptographic hashing** and **digital signatures** in securing data.  
- Illustrate the principles of **transaction validation** and **blockchain immutability**.  
- Provide a simplified framework for understanding **decentralized ledger technology** through practical implementation in Java.
```

Future Enhancements
- **Networking Support** — enable multiple nodes to communicate and maintain a distributed ledger.  
- **Mining Simulation** — implement a proof-of-work mechanism to validate new blocks.  
- **Graphical User Interface (GUI)** — create a user-friendly wallet and transaction dashboard.  
- **Persistent Storage** — integrate file-based or database-backed storage for blockchain data.  
- **Smart Contract Module** — explore programmable transactions within the blockchain.
