package co.madelem.complejo.dominio;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String celular;

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", celular=" + celular + "]";
    }

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        System.out.println("\n"+this);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
