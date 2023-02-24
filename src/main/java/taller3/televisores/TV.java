package taller3.televisores;

public class TV {
    //atributos de clase
    private static int numTV;
    //atributos de instancias
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control Control;

    //metodos
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public static int getNumTV() {
        return numTV;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 0 && canal <= 120 && getEstado()) {
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return Control;
    }

    public void setControl(Control control) {
        Control = control;
    }

    public static void setNumTV(int i) {
        numTV ++;
    }
    public boolean getEstado() {
        return estado;
    }
    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }

    public void canalUp() {
        if (getEstado() && this.canal < 120) {
            this.canal++;
        }
    }
    public void canalDown() {
        if (getEstado() && this.canal > 0) {
            this.canal--;
        }
    }
    public void volumenUp() {
        if (getEstado() && this.volumen < 7) {
            this.volumen++;
        }
    }
    public void volumenDown() {
        if (getEstado() && this.volumen > 0) {
            this.canal--;
        }
    }
}
