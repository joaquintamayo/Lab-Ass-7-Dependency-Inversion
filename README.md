# Lab-Ass-7-Dependency-Inversion

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.


## UML Class Diagram
![UML Class Diagram](https://github.com/joaquintamayo/Lab-Ass-7-Dependency-Inversion/assets/152839460/2c8f4ad8-0700-4b9c-8f88-ed2aeda3e6c5)
