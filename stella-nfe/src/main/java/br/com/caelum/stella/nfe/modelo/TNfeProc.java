//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNfeProc", propOrder = { "nFe", "protNFe" })
public class TNfeProc {

    @XmlElement(name = "NFe", required = true)
    protected TNFe nFe;

    @XmlElement(required = true)
    protected TProtNFe protNFe;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    public TNFe getNFe() {
        return nFe;
    }

    public void setNFe(TNFe value) {
        this.nFe = value;
    }

    public TProtNFe getProtNFe() {
        return protNFe;
    }

    public void setProtNFe(TProtNFe value) {
        this.protNFe = value;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String value) {
        this.versao = value;
    }

}