import java.util.Objects;

public class Contato {
    /**
     * Contact name
     */
    private String nome;

    /**
     * Contact number
     */
    private int numero;

    /**
     * Constructor
     *
     * @param nome Contact name
     * @param numero Contact number
     */
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    /**
     * Getter of this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter of this.numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * equals() method to help comparisons
     *
     * @param object Object to be compared to this object
     *
     * @return boolean true if this instance equals to the passed object, otherwise false
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Contato other = (Contato) object;
        return this.getNome() == other.getNome();
    }

    /**
     * hashCode() method to helps comparisons
     *
     * @return Return the hash code related to this object
     */
    public int hasCode() {
        return Objects.hash(this.getNome());
    }
}