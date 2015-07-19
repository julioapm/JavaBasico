package main;

import java.sql.*;
import javax.sql.*;
import org.apache.derby.jdbc.EmbeddedDataSource;

public class Programa {
	// Bando de dados Derby embutido
	public static final String DB_CONN_STRING_CREATE = "jdbc:derby:cadastro;create=true";
	public static final String DB_NAME = "cadastro";
	public static final String USER_NAME = "usuario";
	public static final String PASSWORD = "senha";
	private static DataSource dataSource;

	public static void main(String[] args) {
		// Passo1: criar base de dados embutida
		Connection conexao = null;
		Statement comando = null;
		String sql = "create table produtos( " + "codigo integer not null "
				+ "primary key generated always as identity(start with 1, increment by 1),"
				+ "nome varchar(30) not null)";
		try {
			conexao = getConexaoViaDataSource();
			comando = conexao.createStatement();
			comando.executeUpdate(sql);
		} catch (Exception ex) {
			System.out.println("Falha na criação do BD.");
			ex.printStackTrace();
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException ex) {
					System.out.println("Falha ao fechar conexão com BD.");
					ex.printStackTrace();
				}
			}
		}

		// Passo2: inserir dados
		String sql2 = "insert into produtos(nome) values(?)";
		Connection conexao2 = null;
		PreparedStatement comando2 = null;
		try {
			conexao2 = getConexaoViaDataSource();
			comando2 = conexao2.prepareStatement(sql2);
			comando2.setString(1, "caderno");
			comando2.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Falha ao inserir dados no BD.");
			ex.printStackTrace();
		} finally {
			if (conexao2 != null) {
				try {
					conexao2.close();
				} catch (SQLException ex) {
					System.out.println("Falha ao fechar conexão com BD.");
					ex.printStackTrace();
				}
			}
		}

		//Passo3: consultar dados
		String sql3 = "select * from produtos";
		Connection conexao3 = null;
		PreparedStatement comando3 = null;
		ResultSet resultados = null;
		try {
			conexao3 = getConexaoViaDataSource();
			comando3 = conexao3.prepareStatement(sql3);
			resultados = comando3.executeQuery();
			while (resultados.next()) {
                System.out.println(String.format("Código: %d ; Nome: %s", resultados.getInt("codigo"), resultados.getString("nome")));
            }
		} catch (Exception ex) {
			System.out.println("Falha ao consultar dados do BD.");
			ex.printStackTrace();
		} finally {
			if (conexao3 != null) {
				try {
					conexao3.close();
				} catch (SQLException ex) {
					System.out.println("Falha ao fechar conexão com BD.");
					ex.printStackTrace();
				}
			}
		}
	}

	private static Connection getConexaoViaDataSource() throws Exception {
		if (dataSource == null) {
			EmbeddedDataSource ds = new EmbeddedDataSource();
			ds.setDatabaseName(DB_NAME);
			ds.setCreateDatabase("create");
			ds.setUser(USER_NAME);
			ds.setPassword(PASSWORD);
			dataSource = ds;
		}
		return dataSource.getConnection();
	}
}
