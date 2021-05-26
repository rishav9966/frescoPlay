1. HashMap Library
COLLECTIONS IN JAVA – HASHMAP – LIBRARY

 

 

In a library, there is a set of books from which some are borrowed by the users. You have to perform certain operations with respect to the query using hashmap in Java.


You will be given three datasets. The first one (booksInLibrary) contains book id, book name, and book author. The second (borrowedUsers) contains book id and user id. The third (query) contains the query to perform. These datasets are of string type and are passed in the getQuery() function. Split the string and get the respective parameters.

 

You have to implement the following three functions in class library:

 

createLibraryMap(String booksInLibrary)

createUserMap(String borrowedUsers)

getQuery(String booksInLibrary,String borrowedUsers,String query)

 

Query Type 1:

            Check the availability of a book using its book id. The input should be the book id. If the book is present, the result should be "It is available\nAuthor is <author name>\n". If the book is not present and borrowed by somebody else, the result should be "No Stock\nIt is owned by <user id>\n".

Query Type 2:

            Return the books borrowed by a specific user by using their user id. The input should be user id, and the output should be "<book id> <bookname>\n.... and so on" .

Query Type 3:

            There is more than one book for a given book name. Return the number of books present and borrowed by a user for a specific book name. The input should be the book name. The result should be "<no. of books borrowed> out\n<no. of books present> in\n".

Query Type 4:

            Return the book names of a specific author. The input should be the book author. The output should be "<book name>\n.....and so on".

Query Type 5:

            Return the book names based on the given keyword. The input should be the search keyword. The result should be "<book id> <book name>\n".

 

Sample Input

 

booksInLibrary = 125,C programming,Brian W. Kernighan|546,Java programming,James Gosling|897,Data Structure,Adam Drozdek|265,Data Structure,Adam Drozdek|234,The Java Language Specification,James Gosling

 

125 - book id , C programming - book name , Brian W. Kernighan - author name

 

borrowedUsers = 125,101|897,104

 

125 - book id , 101 - user id.

 

Note: In booksInLibrary, books are separated by "|", book details (book id, book name, author name) are separated by ",". In borrowedUsers, the users are separated by "|", user details (book id, user id) are separated by ",". In a query string, the first character refers to the query type, and the second character refers to the conditional string depending on the query type.

 

For query type 1: query = 1,546 (546 - book id)

 

Sample output:

No Stock

It is owned by 101

 

For query type 2: query = 2,101 (101 - user id)

 

Sample output:

546 Java programming

125 C programming

 

For query type 3: query = 3,Data Structure (Data Structure - book name)

 

Sample output:

1 out

1 in

 

For query type 4: query = 4,James Gosling (James Gosling - author name)

 

Sample output

Java programming

The Java Language Specification

 

For query type 5: query = 5,java (java - search string)

 

Sample output:

546 Java programming

234 The Java Language Specification

 

In createLibraryMap(String booksInLibrary), you have to return the hashmap of the book details. The key should be book id, and the value should be an object which holds the book name and author.

In createUserMap(String borrowedUsers), you have to return the hashmap of the user details. The key should be book id, and the value should be the user id.

In getQuery(String booksInLibrary,String borrowedUsers,String query), you have to return the result based on the query.
