package introducao;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProdutoPerecivel extends Produto implements Perecivel {
	private Date validade;

	public ProdutoPerecivel(String n, double p, int d, int m, int a) {
		super(n,p);
		GregorianCalendar cal = new GregorianCalendar(a, m-1, d); //Subtrair 1 do valor do mês?
		validade = cal.getTime();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "[validade=" + DateFormat.getDateInstance().format(validade) + "]";
	}

	@Override
	public Date getDataValidade() {
		return (Date)validade.clone(); //Porque clonar?
	}
	
	
}
