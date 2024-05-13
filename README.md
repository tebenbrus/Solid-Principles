# Solid Principle

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining [SOLID principles](https://docs.google.com/document/d/1Ax3uBPPj7E-qQ6KsYYSbsO0PSu7Nsy_297HRCkPtBgc/edit). The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other [SOLID principles](https://docs.google.com/document/d/1Ax3uBPPj7E-qQ6KsYYSbsO0PSu7Nsy_297HRCkPtBgc/edit).

Create a repository in your GitHub account. Put your solution there. In the readMe file must include the problem statement, UML Class Diagram of Proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.


## UML DIAGRAM
![Blank diagram (1)](https://github.com/tebenbrus/Solid-Principles/assets/114350433/5632d5f2-aca3-41cb-948f-48e513273bb5)
