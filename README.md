# 🧪 Selenium WebDriver with Java & TestNG

## 📌 Overview
This repository contains an automated testing framework built with **Selenium WebDriver**, **Java**, and **TestNG**. The goal of this project is to provide a robust, scalable, and maintainable framework for automated regression and functional testing of web applications.

---

## 🏗️ Project Architecture

This project follows the **Page Object Model (POM)** design pattern, which enhances test maintenance and reduces code duplication by separating web page elements and actions from the test scripts.

```text
PracticeFromScratch/
├── src/
│   ├── main/java/
│   │   └── com/project/
│   │       ├── base/          # Base Setup (WebDriver initialization, browser configurations)
│   │       ├── pages/         # Page Objects (UI Locators and Page Methods)
│   │       └── utils/         # Helper classes (Explicit waits, Excel reader, Screenshot utility)
│   └── test/java/
│       └── com/project/
│           ├── tests/         # Test Scripts (TestNG Annotations, Assertions)
│           └── listeners/     # TestNG Listeners (Extent Reports, Logging)
├── testng.xml                 # TestNG Suite Configuration
├── pom.xml                    # Maven Dependencies & Plugins
└── README.md

🛠️ Prerequisites & Tools
Before running the project, ensure you have the following installed:

Java: Version 25

Build Tool: Apache Maven

Node.js: Installed (required for Playwright tests)

Testing Framework: TestNG

IDE: IntelliJ IDEA or Eclipse

🚀 Getting Started
1. Clone the Repository
Bash
git clone [https://github.com/AsmaaSamirAhmed/PracticeFromScratch.git](https://github.com/AsmaaSamirAhmed/PracticeFromScratch.git)
cd PracticeFromScratch
2. Install Dependencies
Bash
mvn clean install -DskipTests
⚡ Running Tests
Run via TestNG Suite File:
Right-click testng.xml in your IDE and select Run 'testng.xml'.

Run via Maven Command Line:
Bash
mvn test
