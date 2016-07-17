package org.gradle;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest {
	private int numero1;
	private int numero2;
	private int esperado;

	@Parameters
	public static Collection data() {
		
		try {
			return Arrays.asList(new Object[][] { getXml(), { 2, 2, 4 } });
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static Object[]  getXml() throws JAXBException{
		JAXBContext jaxbContext= JAXBContext.newInstance(Data.class);
		Unmarshaller unmarshaller= jaxbContext.createUnmarshaller();
		Data data= (Data)unmarshaller.unmarshal(new File("D:\\workspace\\Test\\TestJunit\\src\\test\\resources\\org\\gradle\\test-resource.xml"));
		Object [] resultado= {data.getNumero1(),data.getNumero2(),data.getEsperado()};
		return resultado;
	}
	public CalculadoraTest(int numero1, int numero2, int esperado) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.esperado = esperado;
	}

	@Test
	public void addTest() {
		// Arrange
		Calculadora cal = new Calculadora();

		// Act
		int respuesta = cal.add(numero1, numero2);
		// Assert
		Assert.assertEquals(esperado, respuesta);

	}
}
