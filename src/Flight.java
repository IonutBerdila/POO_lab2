class Flight {
    private String destinatia;
    private String ora;
    public Flight(String destinatia, String ora) {
        this.destinatia = destinatia;
        this.ora = ora;
    }
    public String getDestinatia() {
        return destinatia;
    }
    public String getOra(){
        return ora;
    }
    public void setDestinatia(String destinatia) {
        this.destinatia = destinatia;
    }
    public void setOra(String ora) {
        this.ora = ora;
    }
    @Override
    public String toString() {
        return "Am aterizat în \" " + destinatia + " \" la ora "  + ora ;
    }
}
