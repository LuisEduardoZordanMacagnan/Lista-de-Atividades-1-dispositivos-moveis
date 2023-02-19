package questoes;
import java.util.ArrayList;
public class MinhaListaPessoa {
	private static ArrayList<Pessoa> tabelaPessoa;
	
	public boolean insert(Pessoa p) {
		if (p != null) {
			tabelaPessoa.add(p);
			return true;
		}
		return false;
	}
	
	public boolean deletar(String nome) {
		for (Pessoa pessoa : tabelaPessoa) {
			if (pessoa.getNome() == nome) {
				tabelaPessoa.remove(pessoa);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Pessoa> listaPessoas() {
		return tabelaPessoa;
	}
}
