public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao.conectar();
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}