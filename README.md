# Automated Login Testing Using Selenium

## Overview
The primary objective of this project is to automate the login process and validate both successful and unsuccessful login attempts across multiple browsers. The code ensures that the login functionality works as expected by checking the URL and error messages after attempting to log in.

## Framework and Technologies Used

- **Selenium WebDriver**: Used to automate web browsers and simulate user interactions for login testing.
- **TestNG**: A testing framework used to manage and run the test cases.
- **Google Chrome and Microsoft Edge**: The browsers on which the tests are executed to verify cross-browser compatibility.

## How the Code Works

### 1. **Initialization**:
The WebDriver is set up for both **Google Chrome** and **Microsoft Edge**. The browser is launched based on the specified configuration.

### 2. **Define Test Methods**:
Test methods are created for both successful and unsuccessful login attempts. The URL of the login page, along with the correct and incorrect credentials, are defined for testing.

### 3. **Login Validation**:
- The WebDriver navigates to the login page and performs login attempts with valid and invalid credentials.
- It validates the login results by checking:
  - If the URL changes (for successful login).
  - If the correct error message appears (for unsuccessful login).

### 4. **Cross-Browser Compatibility**:
The tests are run on both **Google Chrome** and **Microsoft Edge** to ensure that the login functionality works correctly across different browsers.

### 5. **Output Results**:
Test results are generated for both browsers, indicating whether the tests passed or failed. The success of login attempts and the validation of error messages are reported.

## Example Test Output

Test Browser: Google Chrome Test: Valid Login URL: https://www.example.com/dashboard - Passed

Test: Invalid Login Error Message: "Invalid credentials" - Passed

Test Browser: Microsoft Edge Test: Valid Login URL: https://www.example.com/dashboard - Passed

Test: Invalid Login Error Message: "Invalid credentials" - Passed


## Annotations Used

- **@BeforeClass**: Sets up the WebDriver before any tests run.
- **@BeforeMethod**: Loads the login page before each test method.
- **@Test**: Defines the test methods for both valid and invalid login attempts.
- **@AfterClass**: Quits the WebDriver after all tests are completed.
- **@Factory**: Generates test instances for running the tests on different browsers.

## Prerequisites

- **Java** (version 8 or above)
- **Selenium WebDriver**
- **TestNG** (for managing tests)
- **ChromeDriver** and **EdgeDriver** (for browser automation)
- **Maven** (for dependency management)

## How to Run:

1. Clone this repository or download the source code.
2. Ensure you have **Java**, **Selenium WebDriver**, and **TestNG** set up.
3. Download the required **ChromeDriver** and **EdgeDriver** for your system and configure them in the code.
4. Add the appropriate login page URL and credentials for testing.
5. Run the tests using **TestNG**.
