package Cadastro;

public class Login {

	private String nome;
	private String senha;
	
	public Login (String nome, String senha)  { 
		this.nome = nome;
		this.senha = senha;
	}
	
	
	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	// M๏ฟฝTODOS
	
	public void menuCadastro() {
		System.out.print("##--PIZZARIA GENERATION BRASIL--##\n\n");
        System.out.print("๐|-------------[Login]-------------๐|\n");
        System.out.print("๐|[1] - Login                      ๐|\n");
        System.out.print("๐|[2] - Cadastro                   ๐|\n");
        System.out.print("๐|[3] - Fazer Pedido sem Cadastro  ๐|\n");
        System.out.print("๐|---------------------------------๐|\n");
        System.out.println();
        System.out.print("OBS: A OPรรO [3] BLOQUEIA A OPรรO DE DELIVERY\n");
        System.out.println();
        System.out.print("\nDigite uma opรงรฃo: ");
	}
	
	public void telaAdeus () {
		System.out.println("        r==\r\n"
    			+ "        _  //\r\n"
    			+ "       |_)//(''''':\r\n"
    			+ "         //  \\_____:_____.-----.P\r\n"
    			+ "        //   | ===  |   /        \\\r\n"
    			+ "    .:'//.   \\ \\=|   \\ /  .:'':.\r\n"
    			+ "   :' // ':   \\ \\ ''..'--:'-.. ':\r\n"
    			+ "   '. '' .'    \\:.....:--'.-'' .'\r\n"
    			+ "    ':..:'      ATร LOGO   ':..:'\n");
	}
	
	public void telaAdeus (String mensagem) {
		
		System.out.println("        r==\r\n"
    			+ "        _  //\r\n"
    			+ "       |_)//(''''':\r\n"
    			+ "         //  \\_____:_____.-----.P\r\n"
    			+ "        //   | ===  |   /        \\\r\n"
    			+ "    .:'//.   \\ \\=|   \\ /  .:'':.\r\n"
    			+ "   :' // ':   \\ \\ ''..'--:'-.. ':\r\n"
    			+ "   '. '' .'    \\:.....:--'.-'' .'\r\n"
    			+ "    ':..:'      BEEP BEEP  ':..:'\n"
    			+ mensagem);
	}


	public void setEndereco(String next) {
		// TODO Auto-generated method stub
		
	}

	
}