# University Landing Page with Servlet Backend

This project is a fully functional university landing page that provides a seamless experience for users to explore university information, including courses, about sections, and an integrated Management Information System (MIS). The backend is powered by Java Servlets to manage dynamic content and user interactions.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [How to Contribute](#how-to-contribute)
- [License](#license)

## Project Overview

The project includes:
- A **responsive landing page** for a university.
- Dynamic content powered by **Java Servlets**.
- A backend that handles **user registration**, **login**, and **course browsing**.
- An integrated **MIS** that provides management features for students, faculties, and administrators.

## Features

### Frontend Features:
- **Hero Section**: Welcome message with a search bar for courses and programs.
- **About Section**: Information about the university’s achievements and history.
- **Course Categories**: Displays undergraduate, postgraduate, and online courses.
- **MIS Section**: Introduces the Management Information System features.
- **Responsive Design**: Mobile and tablet-friendly.

### Backend Features (Powered by Java Servlets):
1. **Sign Up & Sign In**: Users can register and log in to the platform.
2. **Role-Based Home Page**: Different user roles (Student, Lecturer, Registrar, Head of Department) have their own dashboard after login.
3. **Persistent and Non-Persistent Cookies**: Supports both session-based and long-term cookies for user authentication.
4. **Forget Password**: Retrieves saved username and password from cookies.
5. **Dynamic Course Display**: Servlets fetch and display courses dynamically from the backend.
6. **Form Validation**: User input is validated both client-side (JavaScript) and server-side (Servlets).
7. **MIS Integration**: Management functionalities for students, faculty, and admin roles.

## Technologies Used

### Frontend:
- **HTML5**: Structure of the landing page.
- **CSS3**: Styling and layout of the page.
- **JavaScript**: Client-side form validation and dynamic functionalities.
- **Font Awesome**: Icons for a more visually appealing UI.

### Backend:
- **Java Servlets**: Handles server-side processing and dynamic content.
- **Tomcat Server**: For running the servlet-based web application.
- **Cookies**: For managing session persistence.
- **JavaScript**: For modal handling and other interactive elements on the page.
- **MySQL** (or any other database): For storing user information and course data.

## Setup and Installation

### Prerequisites:
- Java Development Kit (JDK) 8 or above.
- Apache Tomcat Server 9.0 or higher.
- Eclipse IDE for Java EE Developers.
- MySQL or any preferred database.
- Maven for managing project dependencies.

### Steps to Run the Project:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/university-landing-page.git
   ```

2. **Set up the project**:
   - Open the project in Eclipse.
   - Ensure that you have Apache Tomcat installed and configured in your Eclipse IDE.
   - Set up the **MySQL** database and import the provided SQL scripts located in the `/database` folder.

3. **Configure database connection**:
   - In the project, go to the `db.properties` file and add your database credentials.
   ```properties
   db.url=jdbc:mysql://localhost:3306/university_db
   db.username=root
   db.password=your_password
   ```

4. **Build and deploy the project**:
   - Use **Maven** to build the project.
   - Deploy the project on Apache Tomcat using your Eclipse IDE.

5. **Run the project**:
   - Access the application at `http://localhost:8080/yourProjectName/` after deploying it.

## Usage

- **User Registration**: New users can register using their email and password.
- **Login**: After registration, users can log in and access a role-based dashboard.
- **MIS Features**: Depending on the user role, different functionalities are available in the dashboard (e.g., course management for lecturers, student records for students).
- **Search**: The landing page features a course search bar for users to explore available programs.
- **Cookies and Session Management**: Login sessions can be persistent using cookies.

## Project Structure

```
university-landing-page/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── servlets/           # Java Servlet classes
│   │   │   └── utils/              # Utility classes for database connection, cookie handling, etc.
│   │   ├── webapp/
│   │   │   ├── WEB-INF/            # Deployment descriptor
│   │   │   ├── assets/
│   │   │   │   ├── css/            # CSS stylesheets
│   │   │   │   ├── js/             # JavaScript files
│   │   │   ├── index.html          # Main landing page
│   │   │   └── login.html          # User login page
│   │   └── resources/              # Configurations like db.properties
├── database/
│   └── university_db.sql           # Database schema and sample data
├── README.md                       # Project README file
├── pom.xml                         # Maven dependencies
└── .gitignore                      # Git ignore file
```

## How to Contribute

If you would like to contribute to this project, follow these steps:
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

