package br.com.dio.dominio;

public class Curso extends Conteudo {
  private int cargaHoraria;

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * this.cargaHoraria;
  }

  @Override
  public String toString() {
    return this.getTitulo();
  }
}
