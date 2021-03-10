package com.teste;



import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AssertJ {

	@Test
	public void checkEquality() {
		Person person = new Person("Barack", "Obama");
		Person personClone = person;
		
		assertThat(person).isEqualTo(personClone);
	}
}
