import java.util.Objects;

public class Targa {
    private String numero;

    public Targa(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Targa targa = (Targa) o;
        return Objects.equals(numero, targa.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Targa{" +
                "numero='" + numero + '\'' +
                '}';
    }
}