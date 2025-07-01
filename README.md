# Student-Management-System 💻
A Java Swing based Student Management System with Login, Signup, Attendance, and Performance modules.

This Student Management System is a desktop-based application for managing student records, attendance, and academic performance using Java.

## Features
- Login / Signup authentication (Secure login for admin and users)
- Dashboard navigation  
- Student management (Add, Edit, Delete, View)  
- Attendance tracking  
- Grade & Performance tracking 
- Clean and intuitive UI

## Technologies Used
- Java (Swing)  
- MySQL (Database)  
- JDBC (for Database connectivity)
- Netbeans (Java IDE)

## Libraries Required
- MySQL JDBC Connector
- JCalendar (for date inputs)
- Apache POI (for report export - optional)

## Installation

### Prerequisites
- JDK: 17.0.9
- NetBeans IDE: 19
- MySQL Server: 8.0.36
- MySQL Workbench: 8.0.36
- MySQL JDBC Connector: 8.0.33
- JCalendar: 1.4
- Apache POI: 5.2.3 (Optional)

## How to Run
1. Clone the repository
2. Open in NetBeans or any Java IDE
3. Import the `student_db.sql` file into your MySQL server
4. Download and add the MySQL JDBC Driver- (Connector/J 8.0.33) to your project libraries 
5. Update your MySQL credentials in `DBConnection.java`:

   ```java
   conn = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/student_management",
       "root",      // your username
       "Your_Password"  // your password
   );

6. Connect your MySQL DB using `DBConnection.java`.     
7. Run `LoginForm.java` or `LandingPage.java` to start
 
