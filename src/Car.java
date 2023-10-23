 class Car {
    private String marca;
    private int anul;
    public Car(String marca, int anul) {
        this.marca = marca;
        this.anul = anul;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnul(){
        return anul;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAnul(int anul) {
        this.anul = anul;
    }
    @Override
    public String toString() {
        return "Mașina cu marca \" " + marca + " \" fabricată în anul "  + anul ;
    }
}
