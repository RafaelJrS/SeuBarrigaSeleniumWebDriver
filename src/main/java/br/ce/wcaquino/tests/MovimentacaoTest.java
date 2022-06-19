package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.setDataMovimentacao("14/06/2022");
		movPage.setDataPagamento("14/07/2022");
		movPage.setDescricao("Movimentação do Teste");
		movPage.setInteressado("Interessado Teste");
		movPage.setValor("750");
		movPage.setConta("Conta Teste Alterada");
		movPage.setStatusPago();
		movPage.salvar();
	}

}
