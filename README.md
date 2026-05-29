# Deli CLI - Command Line Interface Ordering System

A Java-based command-line application for managing deli orders and inventory. This project demonstrates core Java concepts including file I/O, data management, and service-oriented architecture.

---

## 🎯 Project Overview

Deli CLI is a console-based application that allows users to browse products, place orders, and generate digital receipts. The system manages inventory through CSV files and provides real-time order processing with automatic receipt generation.

---

## ✨ Features

- **Browse Categories** - View Chips, Drinks, and Sandwiches separately
- **Item Selection** - Add items to order with quantity selection
- **Order Management** - Manage items in cart before checkout
- **Checkout System** - Process orders with automatic calculation and tax
- **Receipt Generation** - Create timestamped receipt files for each order
- **Transaction History** - Track all orders in CSV format
- **Inventory Tracking** - Monitor stock levels per item
- **Service-Oriented Architecture** - Separate services for each product category
- **User-Friendly Menu System** - Simple navigation between product sections

---

## 🛠️ Technology Stack

- **Language:** Java 11+
- **Build Tool:** Maven
- **Data Storage:** CSV files
- **Architecture:** Service-based (Service Layer Pattern)
- **File I/O:** Java NIO & traditional I/O

---

## 📁 Project Structure

```
deli-cli/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── yearup/
│       │           ├── Program.java              (Entry point)
│       │           ├── controller/
│       │           │   ├── Menus.java            (Menu navigation)
│       │           │   └── UI.java               (User interface)
│       │           ├── models/
│       │           │   ├── enums/                (Enum types)
│       │           │   ├── Chips.java
│       │           │   ├── Drink.java
│       │           │   ├── Order.java
│       │           │   ├── Product.java
│       │           │   └── Sandwich.java
│       │           ├── services/
│       │           │   ├── interfaces/
│       │           │   │   ├── ChipService.java
│       │           │   │   ├── DrinkService.java
│       │           │   │   ├── OrderService.java
│       │           │   │   └── SandwichService.java
│       │           │   └── implement/
│       │           │       ├── ChipServiceImplementation.java
│       │           │       ├── DrinkServiceImplementation.java
│       │           │       ├── OrderServiceImplementation.java
│       │           │       └── SandwichServiceImplementation.java
│       │           └── util/
│       │               └── DataManager.java      (File operations)
│       └── resources/
│           ├── transaction-history.csv
│           └── receipts/                         (Generated receipts)
├── pom.xml
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- Git (optional)

### Installation

1. **Clone or download the project**
   ```bash
   git clone <repository-url>
   cd deli-cli
   ```

2. **Create required directories and files**
   ```bash
   mkdir -p src/main/resources/receipts
   ```

3. **Create `src/main/resources/transaction-history.csv`** with headers:
   ```csv
   orderId,customerId,productId,quantity,price,date
   ```

4. **Build the project**
   ```bash
   mvn clean compile
   ```

5. **Run the application**
   ```bash
   mvn exec:java -Dexec.mainClass="com.yearup.Program"
   ```

   Or compile and run directly:
   ```bash
   mvn clean package
   java -cp target/deli-cli-1.0-SNAPSHOT.jar com.yearup.Program
   ```

---

## 📖 Usage

Upon running the application, you'll see a menu with the following options:

```
=== DELI CLI MENU ===
1. Browse Products
2. Place Order
3. View Order History
4. Exit

Choose an option:
```

### Example Workflow

1. **Browse Products** - View all available items with prices
2. **Place Order** - Select items and quantities
3. **Checkout** - Confirm purchase and generate receipt
4. **Receipt** - Automatically saved to `receipts/` folder with timestamp

---

## 📝 Key Classes

### `Menus.java`
Handles menu navigation and workflow between different ordering sections.

### `UI.java`
Manages all user interaction and display logic through the console interface.

### Service Interfaces & Implementations
Each product category has its own service pattern:

- **ChipService / ChipServiceImplementation** - Manages chip inventory and orders
- **DrinkService / DrinkServiceImplementation** - Manages drink inventory and orders
- **SandwichService / SandwichServiceImplementation** - Manages sandwich inventory and orders
- **OrderService / OrderServiceImplementation** - Manages overall order processing and checkout

### Model Classes
- **Chips** - Represents chip products with pricing and inventory
- **Drink** - Represents beverage products
- **Sandwich** - Represents sandwich products
- **Order** - Represents complete customer orders
- **Product** - Base class or interface for all product types

---

## 💾 Data Files

### transaction-history.csv
Stores all completed orders in CSV format:
```csv
orderId,customerId,productId,quantity,price,date
1,101,5,2,29.99,2025-05-29
2,102,3,1,49.99,2025-05-28
```

### Receipt Files
Generated automatically in `src/main/resources/receipts/`
- Filename format: `yyyyMMdd_HHmmss.txt`
- Example: `20250529_001737.txt`
- Contains order details, items, total, and date/time

---

## ⚙️ Configuration

### Product Database
Edit product data in the application by modifying the data loading mechanism in `DataManager.java`:

```java
// Example: Add products from a source
products.add(new Product(1, "Turkey Sandwich", 8.99));
products.add(new Product(2, "Roast Beef", 9.99));
```

### File Paths
If you need to change file locations, modify these constants in `DataManager.java`:
```java
private static final String TRANSACTION_FILE = "src/main/resources/transaction-history.csv";
private static final String RECEIPT_DIR = "src/main/resources/receipts";
```

---

## 🐛 Troubleshooting

### FileNotFoundException: transaction-history.csv
**Solution:** Create the file manually or run the application to auto-generate it.

### Invalid filename syntax (colons in timestamp)
**Solution:** Ensure timestamps use underscores instead of colons:
- ✅ Correct: `20250529_001737`
- ❌ Wrong: `2025-05-29 00:17:37`

### Directory not found error
**Solution:** Create the `src/main/resources/receipts/` directory manually.

### Maven build issues
**Solution:** Clear and rebuild:
```bash
mvn clean install
```

---

## 🔄 Common Tasks

### View Transaction History
```bash
cat src/main/resources/transaction-history.csv
```

### View Generated Receipts
```bash
ls src/main/resources/receipts/
cat src/main/resources/receipts/<receipt-filename>.txt
```

### Add a New Product
Edit `DataManager.java` or create a product configuration file and load it.

---

## 🎓 Learning Outcomes

This project demonstrates:
- ✅ Object-oriented programming principles
- ✅ File I/O operations (CSV reading/writing)
- ✅ Service-oriented architecture
- ✅ Exception handling
- ✅ ArrayList and Collections
- ✅ User input handling
- ✅ Data persistence

---

## 📦 Dependencies

```xml
<!-- Maven pom.xml dependencies -->
<dependencies>
    <!-- Add any external dependencies here -->
</dependencies>
```

Currently uses only Java standard library (no external dependencies).

---

## 🔐 Security Notes

- **User Input Validation:** All user inputs are validated before processing
- **File Permissions:** Ensure read/write permissions for resource directories
- **Data Privacy:** No sensitive customer data should be stored (for educational purposes)

---

## 🚀 Future Enhancements

- [ ] Database integration (MySQL/SQLite)
- [ ] Customer authentication system
- [ ] Email receipt delivery
- [ ] Advanced inventory management
- [ ] Discount/coupon system
- [ ] Analytics and reporting
- [ ] GUI version using JavaFX

---

## 📄 License

This project is for educational purposes. Modify and use as needed for your learning.

---

## 👨‍💻 Author

Created as a Java learning project demonstrating core programming concepts.

---

## 📞 Support

For issues or questions:
1. Check the Troubleshooting section above
2. Verify all required directories exist
3. Ensure Maven is properly configured
4. Check file permissions on resource directories

---

## 📚 References

- [Java File I/O Documentation](https://docs.oracle.com/javase/tutorial/i18n/resbundle/index.html)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)
- [Design Patterns - Service Layer](https://www.baeldung.com/design-patterns-in-java)

---

**Last Updated:** May 29, 2025
