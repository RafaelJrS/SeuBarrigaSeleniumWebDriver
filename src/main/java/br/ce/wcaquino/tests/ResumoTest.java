package br.ce.wcaquino.tests;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.ResumoPage;

public class ResumoTest extends BaseTest {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	@Test
	public void testExcluirMovimentacao(){
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimenta��o removida com sucesso!",
				resumoPage.obterMensagemSucesso());
	}
	
	@Test
	public void testResumoMensal() {
		menuPage.acessarTelaResumo();
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
	}
}