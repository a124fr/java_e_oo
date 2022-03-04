// contrato Autenticavel
// quem assinar esse contrato, precisa implementar
// o método set Senah
// o método autentica
public interface Autenticavel {
	
	void setSenha(int senha);
	
	boolean autentica(int senha);
}
