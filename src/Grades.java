

import java.util.ArrayList;
import java.util.LinkedList;

public class Grades {

    private ArrayList<Double> grades= new ArrayList();

    public void show(ArrayList<Double> list){
        System.out.print("Oceny: ");
        for (Double x: list){
            System.out.print(x+" ");
        }
    }

    public double findMax(double max){

for (int i=0;i< grades.size();i++){
    if (grades.contains(max)){
        if (grades.get(i) > max){
            max = grades.get(i);
        }
    }
    else{
        max--;
    }
}

        return max;
    }


    public double findMin(double min){

        for (int i=0;i<grades.size();i++){
            if (grades.contains(min)){
                if (grades.get(i) <min){
                    min =grades.get(i);
                }
            }
            else{
                min++;
            }
        }

        return min;
    }


    public double calculateMean(){
        double mean =0;
        double suma=0;
        for (int i=0;i<grades.size();i++){
        suma+=grades.get(i);
        }
        mean = suma/grades.size();
        return mean;
    }

    public static void main(String[] args) {
        System.out.println("ZADANIE 1.");
        Grades iT = new Grades();

        iT.grades.add(5.0);
        iT.grades.add(4.0);
        iT.grades.add(5.0);
        iT.grades.add(6.0);
        iT.grades.add(5.0);
        iT.grades.add(5.0);
        iT.grades.add(5.0);


        iT.show(iT.grades);

        double max = iT.findMax(6);
        double min = iT.findMin(1);

        System.out.println();
        System.out.println("Max="+max);
        System.out.println("Min="+min);

        iT.grades.remove(max);
        iT.grades.remove(min);

        System.out.println("średnia ocen bez wartości granicznych="+iT.calculateMean());
        iT.show(iT.grades);
        System.out.println();
        System.out.println();
        System.out.println("ZADANIE 2.");


        //DRUGA CZĘŚĆ ZADANIA:
        //Tworzę obiekty klasy Book
        Book book1 = new Book("Pan Tadeusz",1890);
        Book book2 = new Book("Wołanie kukułki", 2015);
        Book book3 = new Book("Kuba Wojewódzki nieautoryzowana autobiografia",2018);
        Book book4 = new Book("Słownik",2010);


        //tworzę liste połączoną
        LinkedList<Book> books = new LinkedList();
        //do listy dodaje poszczególne obikety klasy Book za pomcoą metody add(int index,Object O)
        books.add(0,book1);
        books.add(1,book2);
        books.add(2,book3);
        books.add(3,book4);


        for(Book x:books){
            //wyświetlam tylko ksiązki wydane  nie dalej niż w 2000 roku
            if (x.getYear() <= 2000) {
                System.out.println(x.getTitle());
            }
        }

    }
    }

