/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  * Copyright 2019-2025 the original author or authors.
 *  *  *  *  *  *
 *  *  *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  *  *  * You may obtain a copy of the License at
 *  *  *  *  *  *
 *  *  *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *  *  *
 *  *  *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  *  *  * See the License for the specific language governing permissions and
 *  *  *  *  *  * limitations under the License.
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */

package test.org.springdoc.api.v30.app155;

/**
 * The type Abstract int parameter object.
 *
 * @param <T> the type parameter
 */
class AbstractIntParameterObject<T extends Integer> {

	/**
	 * The Primitive base field.
	 */
	int primitiveBaseField;

	/**
	 * The Generic field.
	 */
	T genericField;

	/**
	 * Gets primitive base field.
	 *
	 * @return the primitive base field
	 */
	public int getPrimitiveBaseField() {
		return primitiveBaseField;
	}

	/**
	 * Sets primitive base field.
	 *
	 * @param primitiveBaseField the primitive base field
	 */
	public void setPrimitiveBaseField(int primitiveBaseField) {
		this.primitiveBaseField = primitiveBaseField;
	}

	/**
	 * Gets generic field.
	 *
	 * @return the generic field
	 */
	public T getGenericField() {
		return genericField;
	}

	/**
	 * Sets generic field.
	 *
	 * @param genericField the generic field
	 */
	public void setGenericField(T genericField) {
		this.genericField = genericField;
	}
}
