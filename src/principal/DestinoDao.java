package principal;
import java.sql.Connection;
import java.sql.Date;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class DestinoDao {
	Connection conn = null;
	PreparedStatement pstm = null;
	
	
	public void save(DesafioDestino destino) {
		String sql = "INSERT INTO destino (email,nome,pagamento,cep,sobrenome,estado) VALUES(?,?,?,?,?,?)";
		
		try {
	         conn = Conexao.createConnectionToMySQL(); 

	         pstm = conn.prepareStatement(sql);
	         pstm.setString(1, destino.getNome());
	         pstm.setString(2, destino.getEmail());
	         pstm.setString(3, destino.getEstado());
	         pstm.setString(4, destino.getSobrenome());
	         pstm.setString(5, destino.getPagamento());
	         pstm.setString(6, destino.getCep());
	    
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
		String sql = "DELETE FROM destino WHERE id = ? ";
		
		
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
	
	public void update(DesafioDestino destino) {

	      String sql = "UPDATE  contato SET nome = ?,sobrenome = ?,email = ?,estado = ?,cep = ?, "+" WHERE id = ?";

	      try {
	         conn = Conexao.createConnectionToMySQL(); 

	         pstm = conn.prepareStatement(sql);
	         pstm.setInt(1,destino.getId());
	         pstm.setString(2, destino.getNome());
	         pstm.setString(3,destino.getSobrenome());
	         pstm.setString(4, destino.getEmail());
	         pstm.setString(5, destino.getEstado());
	         pstm.setString(6, destino.getCep());
	         
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

}
