public class Book {
    //Atrybuty klasy Book: rok i tytuł
    private String title;
    private int year;

    //konstruktor:
    public Book(String title,int year){

        this.title = title;
        this.year = year;

    }

    //gettery i settery:
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

}
