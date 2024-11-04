package uni1a;

public class Investigador {
    private String nombre;
    private String areaDeInvestigacion;

    public Investigador(String nombre, String areaDeInvestigacion) {
        this.nombre = nombre;
        this.areaDeInvestigacion = areaDeInvestigacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaDeInvestigacion() {
        return areaDeInvestigacion;
    }

    public void setAreaDeInvestigacion(String areaDeInvestigacion) {
        this.areaDeInvestigacion = areaDeInvestigacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
