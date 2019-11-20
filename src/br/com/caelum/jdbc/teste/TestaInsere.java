package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("alexuniversal@outlook.com");
		contato.setEndereco("rua willis robert banks 549");
		contato.setDataNascimento(Calendar.getInstance());
		
		contato.setNome("deza");
		contato.setEmail("deza@gmail.com");
		contato.setEndereco("rua willis robert banks 549");
		contato.setDataNascimento(Calendar.getInstance());
		
		contato.setNome("deza");
		contato.setEmail("deza@gmail.com");
		contato.setEndereco("rua willis robert banks 549");
		contato.setDataNascimento(Calendar.getInstance());
		// grave ness conexao
		ContatoDao dao = new ContatoDao();
		
		// metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravando");
		
	}

}
