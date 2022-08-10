class libraryDemo {
    //attributes
    String titles;
    int yearOfPublishing;
    long ISBNNumber;
    String authorName;

    public static void main(String[] args ) {
        librarydemo obj = new librarydemo();
        System.out.println("obj.titles" + obj.titles);
        System.out.println("obj.yearOfPublishing " + obj.yearOfPublishing);
        System.out.println("obj.ISBNNumber = " + obj.ISBNNumber);
        System.out.println("obj.authorName = " + obj.authorName);

        obj.titles = "Coding Science";
        obj.authorName = "Mikail Rasheed";
        obj.ISBNNumber = 43236765;
        obj.yearOfPublishing = 2065;

        System.out.println("obj.titles" + obj.titles);
        System.out.println("obj.yearOfPublishing " + obj.yearOfPublishing);
        System.out.println("obj.ISBNNumber = " + obj.ISBNNumber);
        System.out.println("obj.authorName = " + obj.authorName);
    }
}
