# Price Comparison Using Selenium

## Overview
This project automates the process of comparing product prices across multiple e-commerce websites using **Selenium WebDriver**. The main goal is to extract price information for a specific product from various online retailers, perform basic analysis (such as calculating minimum, maximum, and average prices), and output the results.

## Framework and Technologies Used

- **Selenium WebDriver**: Used to automate web browsers for scraping price data from multiple e-commerce websites.
- **Java**: The primary programming language for implementing the solution and handling the logic of the price comparison.
- **XPath**: Employed to locate specific elements on web pages (price elements) for extracting data.

## How the Code Works

### 1. **Initialization**:
The program starts by configuring the **Selenium WebDriver** for Chrome, which will be used to automate browser interactions.

### 2. **Define Product and URLs**:
A product name is defined, and a list of URLs from various e-commerce sites is provided where the price of the product will be scraped.

### 3. **Price Collection**:
The WebDriver visits each specified URL.
It uses **XPath** to locate the HTML elements that contain the product prices. The XPath expressions are tailored to match the specific structure of each website.

### 4. **Price Analysis**:
Once prices are collected, the program calculates:
- **Minimum price**: The lowest price across all websites.
- **Maximum price**: The highest price found.
- **Average price**: The mean value of all collected prices.

### 5. **Output Results**:
Finally, the program prints the minimum, maximum, and average prices to the console for comparison.

## Example Output
Prdocut: Example Product Minimum Price: 199$ Maximum Price: $249.99 Average Price: $224.99


## Prerequisites

- **Java** (version 8 or above)
- **Selenium WebDriver**
- **ChromeDriver** (for Chrome browser automation)
- **Maven** (for dependency management)


