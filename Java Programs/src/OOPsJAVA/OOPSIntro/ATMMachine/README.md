# 🏧 ATM Machine — Java Project

A simple **ATM Machine simulation** built in Java using **only Classes and Methods** (OOP basics).  
This project was made to practice Object-Oriented Programming concepts like class design, method calling, and user interaction via Scanner.

---

## 📌 Features

- 🔐 PIN verification with retry on wrong input
- 💰 Check Account Balance
- 💸 Withdraw Money
- 🏦 Deposit Money
- 🔄 Loops back to menu after each transaction

---

## 🛠️ Concepts Used

| Concept | Usage |
|---|---|
| Class | `ATM` class holds all data and behavior |
| Methods | `checkPin()`, `menu()`, `withdraw()`, `deposit()`, etc. |
| Scanner | Takes user input at runtime |
| Loops | `while` loop for PIN retry and menu navigation |
| Conditionals | `if-else` for PIN check and menu choices |

---

## 📂 Project Structure

```
ATMMachine/
│
├── ATMMachine.java       # Main class (entry point)
└── ATM.java              # ATM class with all methods
```

---

## ▶️ How to Run

**1. Clone the repository**
```bash
https://github.com/aka-sidd/JAVA-DSA-Practice.git
```

**2. Open in IntelliJ IDEA** (or any Java IDE)

**3. Run `ATMMachine.java`**

**4. Follow the prompts:**
```
Enter Your PIN:
> 5679

Enter Your choice:
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
```

---

## 💡 Sample Output

```
Enter Your PIN: 
1234
Enter a valid Pin

Enter Your PIN: 
5679

Enter Your choice: 
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
```

---

## 🚀 What I Learned

- How to design a class with fields and methods
- How to call methods from within other methods
- Using `while` loop to retry invalid inputs
- Taking user input using `Scanner` class

---

## 📈 Future Improvements (Planned)

- [ ] Add multiple user accounts
- [ ] Add transaction history
- [ ] Use `ArrayList` to store users
- [ ] Add proper exception handling

---

## 👨‍💻 Author

**Siddharth Pandey**  
Java-DSA Practice Series  
GitHub: [aka-sidd](https://github.com/aka-sidd)

---

> ⭐ If you found this helpful, feel free to star the repo!