package taller3.televisores;

public class Control {
    //Atributos
    private TV tv;

    //metodos
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void turnOn() {
        tv.turnOn();
    }
    public void turnOff() {
        tv.turnOff();
    }
    public void canalUp() {
        tv.canalUp();
    }
    public void canalDown() {
        tv.canalDown();
    }
    public void volumenUp() {
        tv.volumenUp();
    }
    public void volumenDown() {
        tv.volumenDown();
    }

    public void Enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }
}
