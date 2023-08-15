# ShipmentXpress :truck:

ShipmentXpress is a powerful Java-based shipment management system designed to streamline the end-to-end process of handling shipments. From creating new shipments and tracking existing ones to updating details and retrieving information, ShipmentXpress offers a user-friendly interface for efficient shipment management. With features such as CRUD operations, intuitive tracking, and comprehensive documentation, ShipmentXpress simplifies the complexities of logistics, enabling businesses to focus on delivering exceptional service.


![ShipmentXpress Logo](images/poster.png)


## Table of Contents

- :rocket: Features
- :gear: Getting Started
  - :wrench: Prerequisites
  - :computer: Installation
- :book: Javadoc
- 🛠️ Tools Used (Tech Stack)
- :hammer_and_wrench: Usage
- :raised_hands: Contributing
- :email: Contact Us

## :rocket: Features

- Add new shipments with details like package number, content, weight, sender, and recipient addresses.
- Delete shipments by their unique IDs.
- Update shipment details, including content, weight, and recipient address.
- Retrieve shipments by ID, sender address, weight range, or creation date range.

## :book: Javadoc

Explore the comprehensive documentation of the ShipmentXpress project by visiting the Javadoc website: [Javadoc website](https://your-javadoc-website-url.com).

## Tools Used 🛠️

<table align="center">
  <tr>
    <td align="center" width="100">
      <img src="images/java.png" width="48" height="48" alt="Java" /><br>
      Java
    </td>
    <td align="center" width="100">
      <img src="images/maven.png" width="48" height="48" alt="Maven" /><br>
      Maven
    </td>
    <td align="center" width="100">
      <img src="images/springb.png" width="48" height="48" alt="Spring Boot" /><br>
      Spring Boot
    </td>
    <td align="center" width="100">
      <img src="images/restful.png" width="48" height="48" alt="RESTful API" /><br>
      RESTful API
    </td>
  </tr>
  <tr>
    <td align="center" width="100">
      <img src="images/lambok.png" width="48" height="48" alt="Lombok" /><br>
      Lombok
    </td>
    <td align="center" width="100">
      <img src="images/sts.png" width="48" height="48" alt="Eclipse" /><br>
      STS
    </td>
    <td align="center" width="100">
      <img src="images/github.png" width="48" height="48" alt="GitHub" /><br>
      GitHub
    </td>
    <td align="center" width="100">
      <img src="images/postman.png" width="48" height="48" alt="Postman" /><br>
      Postman
    </td>
  </tr>
</table>

## :gear: Getting Started

### :wrench: Prerequisites

Before you begin, make sure you have the necessary tools and components:

- Java JDK (version 8 or higher)
- MySQL database
- Maven

### :computer: Installation

Follow these steps to install and set up ShipmentXpress:

1. Clone the repository:
   git clone https://github.com/Shubh2-0/ShipmentXpress.git
   cd ShipmentXpress

2. Configure database settings:
   Update the persistence.xml file located in the src/main/resources/META-INF directory with your MySQL database details.

3. Build the project:
   mvn clean install

## :hammer_and_wrench: Usage

To use ShipmentXpress:

1. Run the application:
   java -jar target/ShipmentXpress.jar

2. Access the application via your preferred web browser or API client.

3. Perform CRUD operations on shipments using the available endpoints.

## :raised_hands: Contributing

We welcome contributions from the community! Here's how you can contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: git checkout -b feature-name.
3. Make your changes and commit them: git commit -m "Add some feature".
4. Push to the branch: git push origin feature-name.
5. Create a pull request explaining your changes.

## :email: Contact Us

Have questions or suggestions? Feel free to reach out to us via email at shubhambhati226@gmail.com.


