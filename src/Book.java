class Book {
    private String titlul;
    private String autorul;
    public Book(String titlul, String autorul) {
        this.titlul = titlul;
        this.autorul = autorul;
    }
    public String getTitlul() {
        return titlul;
    }
    public String getAutorul(){
        return autorul;
    }
    public void setTitlul(String titlul) {
        this.titlul = titlul;
    }
    public void setAutorul(String autorul) {
        this.autorul = autorul;
    }
    @Override
    public String toString() {
        return "Cartea cu titlul \" " + titlul + " \" a fost scrisă de "  + autorul ;
    }
}
