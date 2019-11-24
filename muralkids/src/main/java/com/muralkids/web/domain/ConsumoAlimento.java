package com.muralkids.web.domain;

import org.hibernate.type.DateType;

public class ConsumoAlimento {

	private DateType data;
	private int consumido;

	public DateType getData() {
		return data;
	}

	public void setData(DateType data) {
		this.data = data;
	}

	public int getConsumido() {
		return consumido;
	}

	public void setConsumido(int consumido) {
		this.consumido = consumido;
	}
}