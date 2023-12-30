# All-Cure-Medical

## Introduction :
* Functionalities: The Java web application will provide an intuitive interface for managing wholesale and retail operations of medicines. It will include features like inventory management, order processing, customer management.
* User Roles and Access Control: The application will have distinct user roles such as administrators, wholesale supplier, and customers. Each role will have specific permissions and access levels to ensure proper control and security over sensitive data and functionalities.
* Inventory Management: The system will allow users to efficiently manage medicine inventory, including functionalities for adding new stock and automatically updating stock levels based on sales and purchases.
* Transaction Processing: The application will facilitate seamless transactions, enabling users to create and process wholesale orders from suppliers and retail sales to customers.


## Technologies used :
* Java
* Spring boot
* Spring JPA
* Hibernate
* Microservices
* Swagger
* Mysql
* Thymaleaf
* Javascript
* HTML
* CSS

## Technical overview :
* **Service-Oriented Architecture**: The project is structured around **four key services**: customer, customerService, orderService, and product, each responsible for distinct functionalities such as managing customer data, handling orders, and overseeing product inventory.
* Integration with **AllCureMedical** via **Feign Client**: AllCureMedical's APIs are seamlessly integrated into the project through a Feign client. This integration allows for easy communication with AllCureMedical's services, enabling functionalities and data exchange critical to the project.
* Data Management with **DAO** and **DTO** Patterns: The project employs robust design patterns like DAO (Data Access Object) and DTO (Data Transfer Object) for efficient data management. DAO patterns streamline data access, while DTO patterns optimize data transfer across different layers or services within the project.
* Dynamic Frontend with **Thymeleaf**: The frontend of the application is developed using Thymeleaf, a powerful templating engine. This choice ensures a dynamic and interactive user interface, enabling seamless integration with the Java-based backend services. Thymeleaf empowers the creation of responsive web interfaces, enhancing user experience in managing wholesale and retail aspects of medicine transactions.
  
## Snapshots:

<p align="center">
<img width="1271" alt="Screenshot 2023-12-30 155816" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/50faaebf-fef3-4f91-b08a-8d623c9547c2">
</p>
<p align="center">
<img width="1261" alt="admin panel-homepage" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/20dbab4c-de70-4816-a84f-f95d46c0b193">
</p>
<p align="center">
  <img width="1279" alt="admin panel-cartpage" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/b509e288-7cb5-4921-8714-1341761f7567">
</p>
<p align="center">
<img width="1259" alt="admin panel-productspage" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/a7c1a2b1-4249-4c4b-9a3f-5acc80ccfad5">
</p>
<p align="center">
<img width="1261" alt="admin panel-userspage" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/ceb2e27c-e034-4ff5-a91c-696839c24563">
</p>
<p align="center">
<img width="1267" alt="admin panel-orderspage" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/7467440b-0599-42fd-a425-1d649d414200">
</p>
<p align="center">
<img width="1261" alt="Screenshot 2023-12-30 160527" src="https://github.com/Prasanna-2000/All-Cure-Medical/assets/82818051/2766d5d4-78ca-4022-83c8-182a5d986083">
</p>
