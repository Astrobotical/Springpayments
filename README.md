# 🛒 BurkeQuest Payments API

### **Overview**
BurkeQuest Payments is a lightweight **eCommerce API** designed to handle **product management, orders, payments, and tagging**. The API integrates with **Stripe** and **PayPal** for secure payments and supports **tag-based filtering** for products. This project is ideal for small eCommerce websites needing a scalable backend.

---

## 🚀 **Features**
- 🏷 **Product Management**: Create, update, and filter products by tags.
- 📦 **Order Management**: Handle orders, including multiple product entries per order.
- 💳 **Payment Processing**: Integrates with **Stripe** and **PayPal**.
- 🔖 **Tag-Based Filtering**: Retrieve products by their assigned tags.
- 🔐 **Authentication & Security**: Secure API endpoints with JWT authentication.
- 📊 **Admin Controls**: Manage products, users, and transactions.

---

## 🛠 **Tech Stack**
| Technology  | Description  |
|-------------|-------------|
| **Spring Boot** | Backend Framework |
| **PostgreSQL** | Database for storing products, orders, and transactions |
| **Spring Security + JWT** | Secure authentication for API |
| **Stripe & PayPal** | Online payment integration |
| **Spring Data JPA** | ORM for managing database interactions |
| **Lombok** | Reduces boilerplate code |
| **Swagger** | API documentation |

---

## 📌 **Installation & Setup**
### **1. Clone the Repository**
```bash
git clone https://github.com/astrobotical/burkequest-payments.git
cd burkequest-payments
