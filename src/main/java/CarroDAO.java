import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    public void adicionarCarro(Carro carro) throws SQLException {
        String sql = "INSERT INTO estoqueCarros (nome, marca, ano, preco) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, carro.getNome());
            stmt.setString(2, carro.getMarca());
            stmt.setInt(3, carro.getAno());
            stmt.setDouble(4, carro.getPreco());
            stmt.executeUpdate();
        }
    }

    public List<Carro> listarCarros() throws SQLException {
        List<Carro> lista = new ArrayList<>();
        String sql = "SELECT * FROM estoqueCarros";
        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Carro carro = new Carro(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("marca"),
                    rs.getInt("ano"),
                    rs.getDouble("preco")
                );
                lista.add(carro);
            }
        }
        return lista;
    }

    public void atualizarCarro(Carro carro) throws SQLException {
        String sql = "UPDATE estoqueCarros SET nome = ?, marca = ?, ano = ?, preco = ? WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, carro.getNome());
            stmt.setString(2, carro.getMarca());
            stmt.setInt(3, carro.getAno());
            stmt.setDouble(4, carro.getPreco());
            stmt.setInt(5, carro.getId());
            stmt.executeUpdate();
        }
    }

    public void deletarCarro(int id) throws SQLException {
        String sql = "DELETE FROM estoqueCarros WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}