package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  private LocalDate data;

  public Mentoria() {
    super();
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20;
  }
}
