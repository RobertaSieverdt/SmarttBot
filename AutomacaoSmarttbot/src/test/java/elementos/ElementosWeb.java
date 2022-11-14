package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

private	By usuario = By.id("login-username");
private	By senha = By.id("login-password");
private By acessar = By.id("login-button");
private By ranking = By.cssSelector("#sidebar-menu-item-scoreboard > span:nth-child(1) > span > svg");
private By notificacao = By.id("pushActionRefuse");
private By robosGratuitos = By.xpath("//*[@id=\"navigation-main-content\"]/div[2]/div[3]/div[2]/div/div/div[1]/button[5]");
private By heitorVillaLobos = By.cssSelector("<svg width=\"13px\" height=\"13px\" viewBox=\"0 0 13 13\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><title>Copiar</title><g id=\"Resoluções\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><g id=\"LARGE\" transform=\"translate(-984.000000, -1401.000000)\" fill=\"#969BA3\" fill-rule=\"nonzero\"><path d=\"M997,1402.44444 C997,1401.6467 996.3533,1401 995.555556,1401 L988.333333,1401 C987.535589,1401 986.888889,1401.6467 986.888889,1402.44444 L986.888889,1403.88889 L985.444444,1403.88889 C984.6467,1403.88889 984,1404.53559 984,1405.33333 L984,1412.55556 C984,1413.3533 984.6467,1414 985.444444,1414 L992.666667,1414 C993.464411,1414 994.111111,1413.3533 994.111111,1412.55556 L994.111111,1411.11111 L995.555556,1411.11111 C996.3533,1411.11111 997,1410.46441 997,1409.66667 L997,1402.44444 Z M992.666667,1412.55556 L985.444444,1412.55556 L985.444444,1405.33333 L992.666667,1405.33333 L992.666667,1412.55556 Z M995.555556,1409.66667 L994.111111,1409.66667 L994.111111,1405.33333 C994.111111,1404.53559 993.464411,1403.88889 992.666667,1403.88889 L988.333333,1403.88889 L988.333333,1402.44444 L995.555556,1402.44444 L995.555556,1409.66667 Z\" id=\"Copiar\"></path></g></g></svg>");
private By modosimulador = By.cssSelector("#container-CreateRobot > div > div > sb-card > sb-card-content > div > div.my-32 > div.w-full.flex.flex-col.md\\:flex-row.gap-32.lg\\:gap-64.items-center.justify-center > div:nth-child(1) > sb-card > sb-card-content > div > sb-button");
private By avancar = By.cssSelector("#container-CreateRobot > div > div > sb-card > sb-card-content > div > div.flex.flex-col.items-center.justify-center > div > sb-card > div > div.mt-24.self-end > sb-button");
private By priceaction = By.cssSelector("body > div.jss1583.jss2295 > div.jss2298.jss2296 > div > div.jss2352 > button > span.jss2181");
private By play = By.xpath("//*[@id=\"simulado_robo_iniciar instance-3362585\"]/span[1]/svg/path");



public By getUsuario() {
	return usuario;
}


public By getSenha() {
	return senha;
}


public By getAcessar() {
	return acessar;
}


public By getRanking() {
	return ranking;
}


public By getNotificacao() {
	return notificacao;
}


public By getRobosGratuitos() {
	return robosGratuitos;
}


public By getHeitorVillaLobos() {
	return heitorVillaLobos;
}


public By getModosimulador() {
	return modosimulador;
}


public By getAvancar() {
	return avancar;
}


public By getPriceaction() {
	return priceaction;
}


public By getPlay() {
	return play;
}
	
}
