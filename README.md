# Automated Testing Framework for ReciPT

This project demonstrates an automated testing framework for the ReciPT web application. The framework uses Selenium WebDriver, JUnit, Maven, and Jenkins to automate the testing process and ensure continuous integration.

## Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Continuous Integration](#continuous-integration)
- [Technologies Used](#technologies-used)

## Project Overview

The key objective of this project is to automate the testing of the ReciPT web application, ensuring its functionality and reliability. The project covers various aspects of test automation, including setup, execution, reporting, and continuous integration.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven
- Chrome browser and ChromeDriver
- Git

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/tonylai2022/Automated-Testing-ReciPT.git
   cd Automated-Testing-ReciPT
2. **Set up ChromeDriver:**
   - Download the ChromeDriver that matches your Chrome version from the ChromeDriver download page.
   - Place the `chromedriver.exe` in a known location and add it to your system PATH.
3. **Install Maven dependencies:**
   ```bash
   mvn clean install

## Running Tests
To run the tests locally, use the following command:

bash
Copy
mvn clean test
This command will execute the test cases and generate reports in the target/surefire-reports directory.

## Continuous Integration

### Jenkins Setup

**Install Jenkins:**
- Follow the instructions on the [Jenkins website](https://www.jenkins.io/download/) to install Jenkins on your machine.

**Configure Jenkins Job:**
1. **Create a new Jenkins job**:
   - Navigate to the Jenkins dashboard.
   - Click on "New Item".
   - Name your job and select "Freestyle project" or any other project type suitable for your needs.

2. **Source Code Management**:
   - Under the "Source Code Management" tab, choose "Git".
   - Enter the repository URL: `https://github.com/tonylai2022/Automated-Testing-ReciPT.git`
   - Configure the branch to build (typically `main` or `master`).

3. **Build Triggers**:
   - Configure how you want Jenkins to trigger builds (e.g., on push notifications, periodically, or manually).

4. **Build**:
   - Add a build step by selecting "Invoke top-level Maven targets".
   - Set the Goals to:
     ```bash
     clean test site
     ```

5. **Post-build Actions**:
   - **Publish JUnit test results**:
     - Add a post-build action "Publish JUnit test result report".
     - Enter `**/surefire-reports/*.xml` in the "Test report XMLs" field to locate the test reports.
   - **Publish HTML reports**:
     - Add a post-build action "Publish HTML reports".
     - Set the "HTML directory to archive" to `target/site`.
     - Set the "Index page[s]" to `index.html`.

By following these steps, Jenkins will be configured to automatically build the project, execute tests, and generate reports each time a change is pushed to the specified branch of your GitHub repository.

## Technologies Used
- Java: The programming language used for writing the test cases.
- JUnit: A testing framework used for creating and running test cases.
- Selenium WebDriver: A tool for automating web application testing.
- Maven: A build automation tool used for managing project dependencies and build lifecycle.
- Jenkins: A continuous integration server used for automating the build and test process.
