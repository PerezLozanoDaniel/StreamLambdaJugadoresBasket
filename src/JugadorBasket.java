import java.text.SimpleDateFormat;
import java.util.Date;

public class JugadorBasket {

    private String dorsal;
    private String nombre;
    private Date fechaNacimiento;
    SimpleDateFormat patronFecha =new SimpleDateFormat("dd/MM/yyyy");
    private String posicion;
    private float altura;
    private int kg;


    public JugadorBasket(String dorsal, String nombre, Date fechaNacimiento, String posicion, float altura, int kg) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.altura = altura;
        this.kg = kg;
    }

    public String getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public float getAltura() {
        return altura;
    }

    public int getKg() {
        return kg;
    }

    public String mostrarDatos(){
        return getDorsal()+" "+getNombre()+" "+patronFecha.format(getFechaNacimiento())+" "+getPosicion()+" "+getAltura()+" "+getKg();
    }
}

