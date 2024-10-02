import java.util.ArrayList;

public class CadastrarClientes {
    ArrayList<Cliente> listaDeClientes;

    public CadastrarClientes(){
        listaDeClientes = new ArrayList<Cliente>();
    }

    public void adicionar(String nome, String cpf){
        Cliente clientes = new Cliente(nome,cpf);
        listaDeClientes.add(clientes);
        System.out.println("Cliente cadastrado com sucesso");
    }
}
