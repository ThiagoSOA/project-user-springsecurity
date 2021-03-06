package br.com.javaparaweb.financeiro.util;
import br.com.javaparaweb.financeiro.usuario.*;
import br.com.javaparaweb.financeiro.conta.*;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO; 
	}
	
	public static ContaDAO criarContaDAO(){
	    ContaDAOHibernate contaDAO = new ContaDAOHibernate();
	    contaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contaDAO;		
	}
}
