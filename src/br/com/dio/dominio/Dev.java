package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

  public Set<Conteudo> getConteudosConcluido() {
    return conteudosConcluido;
  }

  public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
    this.conteudosConcluido = conteudosConcluido;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscrito() {
    return conteudosInscrito;
  }

  public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
    this.conteudosInscrito = conteudosInscrito;
  }

  public void increverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscrito.addAll(bootcamp.getConteudos());
    bootcamp.setDevsIncritos(this);
  }

  public void progredir(Curso curso) {
    Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
    if (conteudo.isPresent()) {
      this.conteudosConcluido.add(conteudo.get());
      this.conteudosInscrito.remove(conteudo.get());
    }
  }

  public double calcularTotalXp() {
    // métpdo percorre a lista de conteúdos assistidos e executa a função calcularXp
    // somando o resultado total
    return this.conteudosConcluido.stream().mapToDouble(Conteudo::calcularXp).sum();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Dev dev = (Dev) obj;

    return Objects.equals(dev.nome, nome) && Objects.equals(dev.conteudosConcluido, conteudosConcluido)
        && Objects.equals(dev.conteudosInscrito, conteudosInscrito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, conteudosConcluido, conteudosInscrito);
  }
}
