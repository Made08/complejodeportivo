package co.madelem.complejo.dominio;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String celular;

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public setEmail(String email) {
        this.email = email;
    }
}
