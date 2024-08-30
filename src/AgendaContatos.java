import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    /**
     * Group of contatos
     */
    private Set<Contato> contatoSet;

    /**
     * Constructor
     * Creates a new HashSet in this.contatoSet
     */
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    /**
     * Allow add a contact to this.contatoSet
     * @param nome Name of the contact
     * @param numero Number of the contact
     */
    public void adicionarContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        this.contatoSet.add(contato);
    }

    /**
     * Alow see all the contacts
     */
    public void exibirContatos() {
        System.out.println(this.contatoSet);
    }

    /**
     * Allow see all the contacts starting with the desired String
     * 
     * @param beginningOfTheName Begining of the name to search
     */
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato>contatosPorNome = new HashSet<>();
        for (Contato contato: this.contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    /**
     * Allows update the number of a contact if the passed name
     * 
     * @param nome       Name of the contact
     * @param novoNumero Number to be the unique new number of the contact
     * 
     * @return Returns the updated contact
     */
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato: this.contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                return contato;
            }
        }
        return null;
    }

}
