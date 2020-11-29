package com.pojo;

import java.math.BigDecimal;

public class Goods {
	private int Goods_num;
	private String Goods_name;
	private String Goods_flavor;
	private String Goods_category;
	private int Goods_specification;
	private int Goods_expiration_date;
	private String Goods_plant;
	private String Goods_legal_person;
	private BigDecimal Goods_mill_price;
	private BigDecimal Goods_first_class_agent_price;
	private BigDecimal Goods_second_class_agent_price;
	private BigDecimal Goods_third_class_agent_price;
	private BigDecimal Goods_store_purchase_price;
	private BigDecimal Goods_sale_price;
	private String Goods_remark;

	public int getGoods_num() {
		return Goods_num;
	}

	public void setGoods_num(int goods_num) {
		Goods_num = goods_num;
	}

	public String getGoods_name() {
		return Goods_name;
	}

	public void setGoods_name(String goods_name) {
		Goods_name = goods_name;
	}

	public String getGoods_flavor() {
		return Goods_flavor;
	}

	public void setGoods_flavor(String goods_flavor) {
		Goods_flavor = goods_flavor;
	}

	public String getGoods_category() {
		return Goods_category;
	}

	public void setGoods_category(String goods_category) {
		Goods_category = goods_category;
	}

	public int getGoods_specification() {
		return Goods_specification;
	}

	public void setGoods_specification(int goods_specification) {
		Goods_specification = goods_specification;
	}

	public int getGoods_expiration_date() {
		return Goods_expiration_date;
	}

	public void setGoods_expiration_date(int goods_expiration_date) {
		Goods_expiration_date = goods_expiration_date;
	}

	public String getGoods_plant() {
		return Goods_plant;
	}

	public void setGoods_plant(String goods_plant) {
		Goods_plant = goods_plant;
	}

	public String getGoods_legal_person() {
		return Goods_legal_person;
	}

	public void setGoods_legal_person(String goods_legal_person) {
		Goods_legal_person = goods_legal_person;
	}

	public BigDecimal getGoods_mill_price() {
		return Goods_mill_price;
	}

	public void setGoods_mill_price(BigDecimal goods_mill_price) {
		Goods_mill_price = goods_mill_price;
	}

	public BigDecimal getGoods_first_class_agent_price() {
		return Goods_first_class_agent_price;
	}

	public void setGoods_first_class_agent_price(BigDecimal goods_first_class_agent_price) {
		Goods_first_class_agent_price = goods_first_class_agent_price;
	}

	public BigDecimal getGoods_second_class_agent_price() {
		return Goods_second_class_agent_price;
	}

	public void setGoods_second_class_agent_price(BigDecimal goods_second_class_agent_price) {
		Goods_second_class_agent_price = goods_second_class_agent_price;
	}

	public BigDecimal getGoods_third_class_agent_price() {
		return Goods_third_class_agent_price;
	}

	public void setGoods_third_class_agent_price(BigDecimal goods_third_class_agent_price) {
		Goods_third_class_agent_price = goods_third_class_agent_price;
	}

	public BigDecimal getGoods_store_purchase_price() {
		return Goods_store_purchase_price;
	}

	public void setGoods_store_purchase_price(BigDecimal goods_store_purchase_price) {
		Goods_store_purchase_price = goods_store_purchase_price;
	}

	public BigDecimal getGoods_sale_price() {
		return Goods_sale_price;
	}

	public void setGoods_sale_price(BigDecimal goods_sale_price) {
		Goods_sale_price = goods_sale_price;
	}

	public String getGoods_remark() {
		return Goods_remark;
	}

	public void setGoods_remark(String goods_remark) {
		Goods_remark = goods_remark;
	}

	@Override
	public String toString() {
		return "Goods [Goods_num=" + Goods_num + ", Goods_name=" + Goods_name + ", Goods_flavor=" + Goods_flavor
				+ ", Goods_category=" + Goods_category + ", Goods_specification=" + Goods_specification
				+ ", Goods_expiration_date=" + Goods_expiration_date + ", Goods_plant=" + Goods_plant
				+ ", Goods_legal_person=" + Goods_legal_person + ", Goods_mill_price=" + Goods_mill_price
				+ ", Goods_first_class_agent_price=" + Goods_first_class_agent_price
				+ ", Goods_second_class_agent_price=" + Goods_second_class_agent_price
				+ ", Goods_third_class_agent_price=" + Goods_third_class_agent_price + ", Goods_store_purchase_price="
				+ Goods_store_purchase_price + ", Goods_sale_price=" + Goods_sale_price + ", Goods_remark="
				+ Goods_remark + ", getGoods_num()=" + getGoods_num() + ", getGoods_name()=" + getGoods_name()
				+ ", getGoods_flavor()=" + getGoods_flavor() + ", getGoods_category()=" + getGoods_category()
				+ ", getGoods_specification()=" + getGoods_specification() + ", getGoods_expiration_date()="
				+ getGoods_expiration_date() + ", getGoods_plant()=" + getGoods_plant() + ", getGoods_legal_person()="
				+ getGoods_legal_person() + ", getGoods_mill_price()=" + getGoods_mill_price()
				+ ", getGoods_first_class_agent_price()=" + getGoods_first_class_agent_price()
				+ ", getGoods_second_class_agent_price()=" + getGoods_second_class_agent_price()
				+ ", getGoods_third_class_agent_price()=" + getGoods_third_class_agent_price()
				+ ", getGoods_store_purchase_price()=" + getGoods_store_purchase_price() + ", getGoods_sale_price()="
				+ getGoods_sale_price() + ", getGoods_remark()=" + getGoods_remark() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
