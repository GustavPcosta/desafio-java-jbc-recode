package principal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//local onde vai ficar minhas funções de manipulação ao banco de dados

public class DesafioDao {
	Connection conn = null;
	PreparedStatement pstm = null;
	
	
	public void save(Desafio usuario) {
		String sql = "INSERT INTO usuario (email,senha,dataCadastro,nome) VALUES(?,?,?,?)";
		
		try {
	         conn = Conexao.createConnectionToMySQL(); 

	         pstm = conn.prepareStatement(sql);
	         pstm.setString(1, usuario.getNome());
	         pstm.setString(2, usuario.getEmail());
	         pstm.setDate(3, new Date(usuario.getDataCadastro().getTime()));
	         pstm.setString(4, usuario.getSenha());
	         pstm.execute();

	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
		         try {
			            if (pstm != null) {
			               pstm.close();
			            }
			            if (conn != null) {
			               conn.close();
			            }
			         } catch (Exception e) {
			            e.printStackTrace();
			     }
			 }
	}

	public void remove(int id) {
		String sql = "DELETE FROM usuario WHERE id = ? ";
		
		
		try {
			conn = Conexao.createConnectionToMySQL();

 

			pstm = conn.prepareStatement(sql);

 

			pstm.setInt(1, id);

 

			pstm.execute();

 

		} catch (Exception e) {

 

			e.printStackTrace();
		} finally {

 

			
		}
		
	
	}
	
	public List<Desafio> getContatos() {

		   

		String sql = "SELECT * FROM usuario";

 

		List<Desafio> usuario = new ArrayList<Desafio>();

 

		
		ResultSet rset = null;

 

		try {
			conn = Conexao.createConnectionToMySQL();

 

			pstm = conn.prepareStatement(sql);

 

			rset = pstm.executeQuery();

 

			
			while (rset.next()) {

 

				Desafio usuario1 = new Desafio();

 

				
				usuario1.setId(rset.getInt("id"));

 

				
				usuario1.setNome(rset.getString("nome"));

 

				
				usuario1.setEmail(rset.getString("email"));

 

				
				usuario1.setDataCadastro(rset.getDate("dataCadastro"));

 

				
				usuario.add(usuario1);
			}
		} catch (Exception e) {

 

			e.printStackTrace();
		} finally {

 

			try {

 

				if (rset != null) {

 

					rset.close();
				}

 

				if (pstm != null) {

 

					pstm.close();
				}

 

				if (conn != null) {
					conn.close();
				}

 

			} catch (Exception e) {

 

				e.printStackTrace();
			}
		}

 

		return usuario;
	}
	
	  public void update(Desafio usuario) {

	      String sql = "UPDATE  contato SET contatonome = ?,idade = ?,dataCadastro = ? "+" WHERE id = ?";

	      try {
	         conn = Conexao.createConnectionToMySQL(); 

	         pstm = conn.prepareStatement(sql);
	         pstm.setString(1, usuario.getNome());
	         pstm.setString(2, usuario.getEmail());
	         pstm.setDate(3, new Date(usuario.getDataCadastro().getTime()));
	         pstm.setInt(4,usuario.getId());
	         pstm.execute();

	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (pstm != null) {
	               pstm.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	
	  void erros() {
			try {
				if (pstm != null) {

	 

					pstm.close();
				}

	 

				if (conn != null) {
					conn.close();
				}

	 

			} catch (Exception e) {

	 

				e.printStackTrace();
			}
		}
}
