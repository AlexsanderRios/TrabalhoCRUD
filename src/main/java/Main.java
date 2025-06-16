import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarroDAO dao = new CarroDAO();

        try {
            Carro novoCarro = new Carro("Civic", "Honda", 2022, 120000.00);
            dao.adicionarCarro(novoCarro);

            List<Carro> carros = dao.listarCarros();
            for (Carro c : carros) {
                System.out.printf("ID: %d | Nome: %s | Marca: %s | Ano: %d | Preço: R$%.2f\n",
                        c.getId(), c.getNome(), c.getMarca(), c.getAno(), c.getPreco());
            }

            if (!carros.isEmpty()) {
                Carro c = carros.get(0);
                c = new Carro(c.getId(), "Civic Sport", "Honda", 2023, 130000.00);
                dao.atualizarCarro(c);
            }

            // dao.deletarCarro(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}