# Currency Converter (CLI) - My First Java Project

Welcome to my first Java project: a simple currency converter! After shifting my focus from web development to Java due to my school’s curriculum, I decided to dive deep and build something practical as my first beginner project.

## Project Overview

This is a CLI-based currency converter that supports conversions between 19 different currencies. Since I’m still learning, I haven’t integrated any APIs yet, so the exchange rates are hard-coded into the program. The project also features basic command-line interface designs to make it more user-friendly.

### Features:
- Convert between 19 currencies.
- Hard-coded exchange rates (no API used).
- Simple CLI design with clear instructions.
- Error handling for invalid inputs.

## Supported Currencies

The converter currently supports the following currencies:
- USD (US Dollar)
- EUR (Euro)
- GBP (British Pound)
- JPY (Japanese Yen)
- AUD (Australian Dollar)
- CAD (Canadian Dollar)
- INR (Indian Rupee)
- CNY (Chinese Yuan)
- CHF (Swiss Franc)
- ...and more!

## How to Run the Project

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/currency-converter-java.git
    ```
2. **Make sure to have already install jdk**:
    ```bash
    java --version
    ```
3. **Compile the Java files**:
    --Compile in any Java IDE and start converting-- 


## How It Works

1. The program prompts you to select the currency you want to convert from.
2. Next, you choose the currency you want to convert to.
3. Finally, enter the amount you wish to convert.
4. The program calculates and displays the converted amount using the hard-coded exchange rates.

### Example Conversion:

```bash
Welcome to the Currency Converter!

Select the currency you want to convert from:
1. USD
2. EUR
3. GBP
...

Select the currency you want to convert to:
1. USD
2. EUR
3. GBP
...

Enter the amount: 100

Converted amount: 85.60 EUR
