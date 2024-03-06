package in.ashokit.binding;

import java.io.Serializable;

public class Country implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer sno;
	private String name;
	private String countryCode;
	public Country(Integer sno, String name, String countryCode) {
		super();
		this.sno = sno;
		this.name = name;
		this.countryCode = countryCode;
	}
	public Country() {
		super();
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "Country [sno=" + sno + ", name=" + name + ", countryCode=" + countryCode + "]";
	}
	
}
