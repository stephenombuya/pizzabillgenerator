# **Pizza Bill Generator 🍕**
A Java application to calculate and generate the bill for pizzas with customizable options such as extra cheese, extra toppings, and takeaway. It includes base classes and extensible features for different types of pizzas like DeluxPizza.

### **Table of Contents**
- Features
- Technologies Used
- Getting Started
- Project Structure
- Future Enhancements
- Contributing
- License


### **Features**
- **Customizable Pizza Options**: Add extra cheese, extra toppings, or opt for takeaway.
- **Deluxe Pizza**: Automatically includes extra cheese and toppings by default.
- **Bill Generation**: Provides a detailed breakdown of the bill.
- **Object-Oriented Design**: Encapsulated and extendable for future features.
- **Scalable**: Easily add more pizza types or customizations.


### **Technologies Used**
- **Programming Language**: Java
- **IDE**: Compatible with any Java IDE (e.g., IntelliJ IDEA, Eclipse)
- **Version**: Java 8 or higher


### **Getting Started**
- Prerequisites
- Install Java (version 8 or higher).
- Install an IDE or text editor for Java development.
- **Clone the repository**:

```bash
git clone https://github.com/stephenombuya/pizzabillgenerator/tree/main
cd pizza-bill-generator
```

- Running the Project
- Open the project in your preferred IDE.
- Navigate to the Main class.
- Run the Main class to see the output.



### **Project Structure**

```bash
pizza-bill-generator/
│
├── src/
│   ├── pizzaBillGenerator/
│   │   ├── Main.java          # Entry point of the application
│   │   ├── Pizza.java         # Base class for Pizza
│   │   ├── DeluxPizza.java    # Subclass for deluxe pizzas
│
├── .gitignore                 # Specifies files to ignore in version control
├── README.md                  # Project documentation
└── LICENSE                    # License information
```




### **Future Enhancements**
1. **Multiple Pizza Orders**:
    - Allow users to order multiple pizzas in a single transaction.

2. Graphical User Interface (GUI):
    - Build a user-friendly interface for selecting pizza options.

3. *More Customizations**:
    - Include options like different crust types, sizes, and sauces.

4. **Discounts and Offers**:
    - Add support for promotional codes and bulk discounts.

5. **Persistence**:
    - Save order history to a database or a file.



### **Contributing**
Contributions are welcome! Please follow these steps:

1. Fork the repository.

2. Create a feature branch:

```bash
git checkout -b feature-name
```

3. Commit your changes:

```bash
git commit -m "Add a new feature"
```

4. Push to the branch:

```bash
git push origin feature-name
```

5. Open a pull request.


### **License**
This project is licensed under the GNU General Public License v3.0. See the `LICENSE` file for details.
