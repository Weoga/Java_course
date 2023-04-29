package Lesson7;

public class Books {

    private String Name;
    private String Author;

    public Type Type;

    public void newBook( String name, String author, Type type){
        this.Name = name;
        this.Author = author;
        this.Type = type;
    }
}

enum Type{
    Science,
    Fantasy,
    Adventure,
    Comedy
}
