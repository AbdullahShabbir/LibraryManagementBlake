import java.util.Scanner;

public class LibraryManagament {
    public static void main(String[] args) {
        String[] books = new String[10];
        int bookCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System");

        while (true) {
            System.out.println("Enter 1 to add a book");
            System.out.println("Enter 2 to search a book");
            System.out.println("Enter 3 to display all books");
            System.out.println("Enter 4 to exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the book: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    books[bookCount] = bookName;
                    bookCount++;
                    System.out.println("Book added successfully\n");
                    break;
                case 2:
                    System.out.print("Enter the name of the book you want to search: ");
                    scanner.nextLine();
                    String searchBookName = scanner.nextLine();
                    boolean isFound = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equals(searchBookName)) {
                            isFound = true;
                            break;
                        }
                    }

                    if (isFound) {
                        System.out.println("Book found in the library\n");
                    } else {
                        System.out.println("Book not found in the library\n");
                    }

                    break;
                case 3:
                    System.out.println("List of all books:");

                    for (int i = 0; i < bookCount; i++) {
                        System.out.println(books[i]);
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank you for using the Library Management System");
                    return;
            }
        }
    }
}
