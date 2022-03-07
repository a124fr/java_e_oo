import java.io.Closeable;
import java.io.IOException;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    private void fecha() {
        System.out.println("Fechando conexao");
    }

	@Override
	public void close() {
		this.fecha();
	}
}