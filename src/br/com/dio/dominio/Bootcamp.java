package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(60);
  private Set<Dev> devsIncritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setConteudos(Conteudo conteudos) {
    this.conteudos.add(conteudos);
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void setDevsIncritos(Dev dev) {
    this.devsIncritos.add(dev);
  }

  public Set<Dev> getDevsIncritos() {
    return devsIncritos;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Bootcamp bootcamp = (Bootcamp) obj;

    return Objects.equals(bootcamp.nome, nome) && Objects.equals(bootcamp.devsIncritos, devsIncritos)
        && Objects.equals(bootcamp.conteudos, conteudos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, devsIncritos, conteudos);
  }

}
