package model;

import javax.xml.bind.annotation.XmlEnum;
//xmle- anotacija , nije klasa pa ne moze embedable
@XmlEnum
public enum VrstaVozila {

	TERETNO,
	PUTNICKO,
	SUV,
	KARAVAN,
	TERENAC;
	
}
