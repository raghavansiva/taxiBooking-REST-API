🚖 Taxi Booking API
This project is a backend REST API for a Taxi Booking Application built using Spring Boot and MySQL.

It supports:

Customer registration and login

Driver summaries

Ride booking functionality

Ride history retrieval

📦 Project Structure
markdown
Copy
Edit
com.taxi.booking
 ├── TaxiBookingApplication.java
 ├── controller
 │    ├── CustomerController.java
 │    ├── DriverController.java
 │    └── RideController.java
 ├── dto
 │    └── RideRequestDto.java
 ├── model
 │    ├── Customer.java
 │    ├── Driver.java
 │    └── Ride.java
 ├── repository
 │    ├── CustomerRepository.java
 │    ├── DriverRepository.java
 │    └── RideRepository.java
 └── service
      └── RideService.java
⚙️ Technologies Used
Java 21

Spring Boot

Spring Data JPA

MySQL Database

Maven

📄 API Endpoints
Customer APIs:

Method	URL	Description
POST	/api/customers/register	Register a new customer
POST	/api/customers/login	Login with name and password
Driver APIs:

Method	URL	Description
GET	/api/drivers/summary	Get all driver details
Ride APIs:

Method	URL	Description
POST	/api/rides/book	Book a ride
GET	/api/rides/history/{customerId}	Get ride history for a customer
🛠 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/your-repo-name.git
Open in Eclipse or any IDE.

Set up your application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
Run TaxiBookingApplication.java as Spring Boot App.

Test the APIs using Postman or Swagger.

🔥 Key Classes Explained
CustomerController.java: Handles customer registration and login.

DriverController.java: Shows driver details.

RideController.java: Manages booking rides and ride history.

RideService.java: Business logic for selecting drivers and booking rides.

🧹 Future Enhancements
Authentication with JWT

Admin panel for managing drivers and customers

Real-time ride tracking

📢 Note
Make sure your MySQL database is running and schema is properly set up before starting the application.

📸 Sample
Example booking ride request:

json
Copy
Edit

{
  "customerId": 1,
  "pickUp": "A",
  "drop": "B",
  "pickUpTime": 10
}

✨ Author
Developed by Raghavan S
Connect through LinkedIn - linkedin.com/in/raghavan-s-7778212a1/
