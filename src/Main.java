public class Main {
    public static void main(String[] args) {
        //Class book
        Book book1 = new Book ("Rich Dad Poor Dad","Robert Kiyosaki");

        System.out.println("Titlul cărții este:" + book1.getTitlul());
        System.out.println("Autorul cărții este:" + book1.getAutorul());


        book1.setTitlul("Rich Kid Smart Kid");
        book1.setAutorul("Robert Kiyosaki");

        System.out.println(book1.toString());

        System.out.println();

        //Class Car
        Car car1 = new Car("Renault",2010);

        System.out.println("Marca mașinii este: " + car1.getMarca());
        System.out.println("Anul fabricării este: " + car1.getAnul());

        car1.setMarca("Renault");
        car1.setAnul(2023);

        System.out.println(car1.toString());

        System.out.println();

        //Class Flight
        Flight flight1 = new Flight("Italia","20:30");

        System.out.println("Destinația zborului este: " + flight1.getDestinatia());
        System.out.println("la ora: " + flight1.getOra());

        flight1.setDestinatia("Italia");
        flight1.setOra("21:00");

        System.out.println(flight1.toString());

        System.out.println();

        //Class Movie
        Movie movie1 = new Movie("Horror","Sam Raimi");

        System.out.println("Filmul: " + movie1.getGenul());
        System.out.println("creat de " + movie1.getRegizorul());

        movie1.setGenul("Dramă");
        movie1.setRegizorul("Sam Raimi");

        System.out.println(movie1.toString());

    }
}