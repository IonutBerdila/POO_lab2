class Movie {
    private String genul;
    private String regizorul;
    public Movie(String genul, String regizorul) {
        this.genul = genul;
        this.regizorul = regizorul;
    }
    public String getGenul() {
        return genul;
    }
    public String getRegizorul(){
        return regizorul;
    }
    public void setGenul(String genul) {
        this.genul = genul;
    }
    public void setRegizorul(String regizorul) {
        this.regizorul = regizorul;
    }
    @Override
    public String toString() {
        return "Era mai mult \" " + genul + " \"  de "  + regizorul ;
    }
}
