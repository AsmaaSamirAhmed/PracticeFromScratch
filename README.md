# 🧪 Selenium WebDriver with Java & TestNG

## 📌 Overview
This repository contains an automated testing framework built with **Selenium WebDriver**, **Java**, and **TestNG**. The goal of this project is to provide a robust, scalable, and maintainable framework for automated regression and functional testing of web applications.

---

## 🛠️ Technologies & Dependencies

### Core Technologies
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 25 | Programming language for test automation |
| **Selenium WebDriver** | 4.45.0 | Browser automation framework for cross-browser testing |
| **TestNG** | 7.12.0 | Testing framework for test execution, configuration, and reporting |
| **Maven** | 3.6.0+ | Build automation and dependency management tool |

### Installation & Setup
1. **Clone Repository**
   ```bash
   git clone https://github.com/AsmaaSamirAhmed/PracticeFromScratch.git
   cd PracticeFromScratch
   ```

2. **Install Dependencies**
   ```bash
   mvn clean install
   ```

3. **Run Tests**
   ```bash
   mvn test
   ```
   Or execute using TestNG XML:
   ```bash
   mvn test -Dsuite=testng.xml
   ```

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
