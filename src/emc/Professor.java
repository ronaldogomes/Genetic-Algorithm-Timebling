package emc;

import java.util.ArrayList;

import entr_saida.Arquivo;



/**
 * Class Professor
 */
public class Professor {

  //
  // Fields
  //
  private String nome;
  /**
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar naquele  perıodo letivo 
   */
  private ArrayList<Disciplina> disciplinasMinistrar;  /**

   * disciplinasMinist: roll de disciplinas que o professor tem compentência para ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar aula    */

  private ArrayList<TimeSlots> horariosIndisponiveis;
  /**
   * um numero natural maior que zero – que identifica de maneira unica o professor. Portanto não ha dois professores com o mesmo código 
   */
  private int codigo;
  
  //
  // Constructors
  //
  public Professor (int codigo, String nome, ArrayList<Disciplina> disciplinasMinistrar) {
	  this.codigo = codigo;
	  this.nome=nome;
	  this.disciplinasMinistrar = disciplinasMinistrar;
  };
 
  //
  // Methods
  //
  /**
   * 
   * @param professores
   * @param codigoProfessor
   * @return Proessor
   *<h2>Descrição</h2>
   * <p>Retorna qual professor tem aquele codigo (codigoProfessor) de uma array list de professor</p>
   * <p>caso o codigo não pertença a nenhum professor do array passado por parametro então retorna null</p>
   */
public static Professor qualProfessor( int codigoProfessor) {
	for (int i = 0; i < Arquivo.professoresEMC.size(); i++) {
		if (Arquivo.professoresEMC.get(i).getCodigo()==codigoProfessor) {
			return Arquivo.professoresEMC.get(i);
		}
	}
	return null;
	
}



  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  public void setNome (String nome) {
    this.nome = nome;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  /**
   * Set the value of disciplinasMinist
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar
   * naquele  perıodo letivo 
   * @param newVar the new value of disciplinasMinist
   */
  public void setDisciplinasMinist (ArrayList<Disciplina> disciplinasMinist) {
    this.disciplinasMinistrar = disciplinasMinist;
  }

  /**
   * Get the value of disciplinasMinist
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar
   * naquele  perıodo letivo 
   * @return the value of disciplinasMinist
   */
  public ArrayList<Disciplina> getDisciplinasMinist () {
    return disciplinasMinistrar;
  }

  /**
   * Set the value of horariosDisponiveis
   * disciplinasMinist: roll de disciplinas que o professor tem compentência para
   * ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar
   * aula
   * @param newVar the new value of horariosDisponiveis
   */
  public void setHorariosIndisponiveis (ArrayList<TimeSlots> horariosIndisponiveis) {
    this.horariosIndisponiveis = horariosIndisponiveis;
  }

  /**
   * Get the value of horariosDisponiveis
   * disciplinasMinist: roll de disciplinas que o professor tem compentência para
   * ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar
   * aula
   * @return the value of horariosDisponiveis
   */
  public ArrayList<TimeSlots> getHorariosIndisponiveis () {
    return horariosIndisponiveis;
  }

  /**
   * Set the value of codigo
   * um numero natural maior que zero – que identifica de maneira unica o professor.
   * Portanto não ha dois professores com o mesmo código 
   * @param newVar the new value of codigo
   */
  public void setCodigo (int codigo) {
    this.codigo = codigo;
  }

  /**
   * Get the value of codigo
   * um numero natural maior que zero – que identifica de maneira unica o professor.
   * Portanto não ha dois professores com o mesmo código 
   * @return the value of codigo
   */
  public int getCodigo () {
    return codigo;
  }

  //
  // Other methods
  //

  /**
   * retorna quantas horas de aula o professor ministra
   * @return       Int
   */
  public int cargaHoraria()
  {
	return codigo;
  }


  /**
   * Retorna verdadeiro se o horario passado por parametro está livre para aquele
   * professor
   * @return       Boolean
   * @param        timeSlot
   */
  public Boolean isTimeSlotAvailable(String timeSlot)
  {
	  return true;
  }

public ArrayList<Disciplina> getDisciplinasMinistrar() {
	return disciplinasMinistrar;
}

public void setDisciplinasMinistrar(ArrayList<Disciplina> disciplinasMinistrar) {
	this.disciplinasMinistrar = disciplinasMinistrar;
}


}
