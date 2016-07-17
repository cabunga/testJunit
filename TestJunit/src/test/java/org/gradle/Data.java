package org.gradle;

import java.io.File;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author USUARIO
 *
 */
@XmlRootElement
public class Data implements Serializable{
	private int numero1;
	private int numero2;
	private int resultado;
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getEsperado() {
		return resultado;
	}
	public void setEsperado(int esperado) {
		this.resultado = esperado;
	}
}