package set.Pesquisa;

public class Tarefa {
    // atributos
    private String descricao;
    private boolean isConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.isConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getIsConcluida() {
        return isConcluida;
    }

    public void setIsConcluida(boolean isConcluida) {
        this.isConcluida = isConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
            "descricao='" + descricao + '\'' +
            ", concluida=" + isConcluida +
            '}';
    }
}
