package testes;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		metodos.abrirNavegador(site);
	}

	@Quando("efetuar o login")
	public void efetuar_o_login() {

		metodos.preencher("LuisSilva22", el.getUsuario());
		metodos.preencher("Luissilv@22", el.getSenha());
		metodos.acessar(el.getAcessar());
		metodos.esperar();
		metodos.clicar(el.getRanking());
	}

	@Quando("selecionar uma opcao de robo")
	public void selecionar_uma_opcao_de_robo() {
		metodos.clicar(el.getNotificacao());
		metodos.clicar(el.getRobosGratuitos());
		metodos.clicar(el.getHeitorVillaLobos());
		metodos.clicar(el.getModosimulador());
		metodos.clicar(el.getAvancar());
		metodos.clicar(el.getPriceaction());
		
	}

	@Entao("devo conseguir executa-lo")
	public void devo_conseguir_executa_lo() {
		metodos.clicar(el.getPlay());

		// metodos.fecharNavegador();
	}

}
