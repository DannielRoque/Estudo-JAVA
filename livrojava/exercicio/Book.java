package br.com.javacore.livrojava.exercicio;

public enum Book {

    JHTP6("Java How to Program 6", "2005"),
    CHTP4("C How to Program 4e", "2004"),
    IW3HTP3("Internet & World wide Web to Program 3e", "2004"),
    CPPHTP4("C++ How to Program 4e", "2003"),
    VBHTP2("Visual Basic .NET how to Program 2e", "2002"),
    CSHARPHTP("C# How to Program", "2002");

    private final String title;
    private final String copyrightyear;

     Book(String title, String copyrightyear){
        this.title = title;
        this.copyrightyear=copyrightyear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightyear() {
        return copyrightyear;
    }
}
