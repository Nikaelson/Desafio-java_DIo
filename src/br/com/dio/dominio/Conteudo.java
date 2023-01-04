package br.com.dio.dominio;

public abstract class Conteudo {
  private String titulo;
  private String descricao;
  protected static final double XP_PADRAO = 10.0;

  abstract public double calcularXp();

  public String getTitulo() {
    return titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString() {
    return "Classe abstrata";
  }
}
