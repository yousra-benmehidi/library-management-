[FR]
Dans cet exercice, nous allons implémenter la gestion d’une simple bibliothèque contenant des 
livres où chaque livre doit avoir un auteur. Pour cela on commencera à créer la classe Personne 
(qui représente les auteurs et aussi les acheteurs des livres). Cette classe est caractérisée par un nom un prénom et l’année de naissance. 
Par la suite créer la classe Document de sorte à ce que chaque document doit posséder un nom 
et au moins un auteur (au maximum 5 auteurs).
- Ajouter la méthode NbrAuteur() dans la classe Document qui retourne le nombre des 
auteurs d’un document. 
- Ajouter aussi la méthode toString() pour afficher le nom et les auteurs d’un document. 
Maintenant, créer la classe Livre qui sera définit comme une sous classe de la classe Document. 
La classe Livre possède le ISBN, le Prix, et l’Année comme attributs.
- Redéfinissez la méthode toString() dans la classe Livre pour afficher tous les 
informations d’un Livre à l’exception de son prix. 
- Ajouter une méthode appelée PrixVente(Personne p) qui affiche le prix de vente de 
chaque Livre, à savoir que le prix sera réduit de 20% pour les personnes moins de 20 
ans. De plus, il faut tester si la personne passée en paramètre est l’auteur du livre, le prix 
sera affiché 0 de sorte que le livre est toujours gratuit pour son auteur(s).

[EN]
In this exercise, we will implement the management of a simple library containing 
books where each book must have an author. For this we will start creating the class Person 
(which represents authors and also buyers of books). This class is characterized by a 
surname a first name and year of birth. 
Then create the Document class so that each document must have a name 
and at least one author (maximum 5 authors).
- Add the NbrAutor() method in the Document class that returns the number of 
authors of a document. 
- Add also the toString() method to display the name and authors of a document. 
Now, create the Book class which will be defined as a subclass of the Document class. 
The Book class has the ISBN, Price and Year as attributes.
- Redefine the toString() method in the Book class to display all 
information on a Book except its price. 
- Add a method called PrixVente(Person p) that displays the selling price of 
each Book, namely that the price will be reduced by 20% for people under 20 
years. In addition, it is necessary to test whether the person given as parameter is the author of the book, the price 
will be displayed 0 so that the book is always free for its author(s).
