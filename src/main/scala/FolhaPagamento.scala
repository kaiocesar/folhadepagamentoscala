object FolhaPagamento extends App {

  // :salario_base 3000
  //   :base_horas 220
  //   :jornada {:inicio 8 :refeicao 60 :termino 17 }
  //   :insalubridade "média"
  //   :periculosidade 0.30
  //   :dependentes 2
  //   :horas_extras {
  //       :domingos_feriados 1
  //       :dias_uteis 2
  //     }
  //   }
  //   }})

  def calcular_inss(salario_bruto: Double) : Double = {
    if (salario_bruto < 1751.82) {
      salario_bruto * 0.08
    } else if (salario_bruto >= 1751.82 && salario_bruto <= 2919.72) {
      salario_bruto * 0.09
    } else if (salario_bruto >= 2919.73 && salario_bruto <= 5839.45) {
      salario_bruto * 0.11
    } else {
      return 642.34
    }
  }

  def calcular_fgts(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_dependentes(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_irrf(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_horas_extras(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_dsr(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_vale_transporte(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_vale_alimentacao(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_adicional_noturno(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_adicional_insalubridade(salario_bruto: Float) : Float = {
    salario_bruto
  }

  def calcular_salario_liquido(salario_bruto: Float) : Float = {
    salario_bruto
  }
    
  // calcular inss
  // calcular o fgts
  // calcular dependentes
  // calcular o IRPF
  // calcular as horas extras
  // calcular DSR (descanso semanal remunerado sobre horas extras)
  // calcular vale transporte
  // calcular o vale alimentação
  // adicional noturno
  // adicional de insalubridade
  // calcular salario liquido

}