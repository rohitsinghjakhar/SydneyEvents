# 🎟️ Sydney Events - Event Listing & Ticketing Website
📌 Project Overview
Sydney Events is a web application that automatically scrapes and lists events happening in Sydney, Australia. Users can browse event details and purchase tickets after opting in with their email. The website updates event listings daily through automated web scraping.

🚀 Features
✅ Automated Event Scraping – Fetches event data daily from sites like TimeOut Sydney, Eventbrite, and Sydney Opera House. >>
✅ Event Listing Page – Displays event details such as name, date, location, and description. >>
✅ Ticket Purchase Flow – Users enter their email before being redirected to the ticketing website.
✅ React.js Frontend – A modern and responsive UI for an engaging experience.
✅ Spring Boot Backend – Manages API endpoints, email collection, and database operations.
✅ MySQL Database – Stores event data and user emails.
✅ Automated Updates – A scheduled job refreshes event listings every 24 hours.

🛠️ Tech Stack
Frontend: React.js, Bootstrap
Backend: Spring Boot (Java), Jsoup (for web scraping)
Database: MySQL
Deployment: Cloud MySQL

# 📂 Project Structure

/sydney-events
├── backend/               # Spring Boot backend
│   ├── src/main/java/com/sydneyevents/
│   │   ├── scraper/       # Web scraping logic (Jsoup)
│   │   ├── controller/    # REST API endpoints
│   │   ├── service/       # Business logic
│   │   ├── repository/    # Database operations (MySQL)
│   ├── src/main/resources/application.properties  # Database & API config
│   ├── pom.xml            # Maven dependencies
│   ├── SydneyEventsApplication.java  # Main backend application
│
├── frontend/              # React.js frontend
│   ├── src/
│   │   ├── components/    # Reusable UI components
│   │   ├── pages/         # Main pages
│   │   ├── App.js         # Root component
│   ├── public/            # Static assets
│   ├── package.json       # Frontend dependencies
│
├── README.md              # Project documentation
└── .gitignore             # Ignore unnecessary files

# 📖 Installation & Setup

1️⃣ Clone the Repository
git clone https://github.com/your-username/sydney-events.git  
cd sydney-events
2️⃣ Backend Setup (Spring Boot)
Install Dependencies
cd backend
mvn clean install
Configure MySQL Database
Update src/main/resources/application.properties with your database credentials:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/sydney_events
spring.datasource.username=root
spring.datasource.password=12345678
Run the Backend


mvn spring-boot:run
Backend should now be running at: http://localhost:8080

3️⃣ Frontend Setup (React.js)
Install Dependencies
cd frontend
npm install

Start the Frontend

npm start
Frontend should now be running at: http://localhost:3000

🔄 How It Works
1️⃣ The backend scrapes event data using Jsoup and stores it in MySQL.
2️⃣ The React frontend fetches events via API and displays them.
3️⃣ Clicking "GET TICKETS" prompts the user for their email.
4️⃣ Email is saved to the backend, and the user is redirected to the ticket site.
5️⃣ A scheduled job refreshes event listings every 24 hours.

🌎 Deployment
Frontend (React.js) – Deploy on Netlify / Vercel
Backend (Spring Boot) – Deploy on AWS / Heroku / DigitalOcean
Database (MySQL) – Use a cloud-hosted MySQL instance

