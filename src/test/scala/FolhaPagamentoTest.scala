class FolhaPagamentoTest extends org.scalatest.FunSuite {

  test("calcular inss") {
    assert(FolhaPagamento.calcular_inss(3000) === 330)
  }

  test("calcular o fgts") {
    assert(FolhaPagamento.calcular_fgts(3000) === 240)
  }

  test("calcular dependentes") {
    assert(FolhaPagamento.calcular_dependentes(2) === 379.18)
  }

  test("calcular o IRRF") {
    assert(FolhaPagamento.calcular_irrf(2) === 8)
  }

  test("calcular as horas extras") {
    assert(FolhaPagamento.calcular_horas_extras(2) === 8)
  }

  test("calcular DSR (descanso semanal remunerado sobre horas extras)") {
    assert(FolhaPagamento.calcular_dsr(2) === 8)
  }

  test("calcular vale transporte") {
    assert(FolhaPagamento.calcular_vale_transporte(3000, 228.80) === Map("vale_transporte" -> 228.8, "aux_transporte" -> 48.80000000000001))
  }

  test("calcular o vale alimentação") {
    assert(FolhaPagamento.calcular_vale_alimentacao(3000) === 600)
  }

  test("adicional noturno") {
    assert(FolhaPagamento.calcular_adicional_noturno(2) === 8)
  }

  test("adicional de insalubridade") {
    assert(FolhaPagamento.calcular_adicional_insalubridade(2) === 8)
  }

  test("calcular salario liquido") {
    assert(FolhaPagamento.calcular_salario_liquido(2) === 8)
  }

}
