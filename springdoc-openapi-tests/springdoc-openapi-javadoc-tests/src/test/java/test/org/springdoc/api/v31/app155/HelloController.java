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

package test.org.springdoc.api.v31.app155;

import org.springdoc.core.annotations.ParameterObject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Hello controller.
 */
@RestController
class HelloController {

	/**
	 * Say hello response entity.
	 *
	 * @param test the test
	 * @return the response entity
	 */
	@GetMapping("/test1")
	public ResponseEntity<String> sayHello(@ParameterObject final ConcreteParameterObject test) {
		System.out.println("Field B = " + test);
		return new ResponseEntity<String>("{\"Say\": \"Hello\"}", HttpStatus.OK);
	}

	/**
	 * Say hello response entity.
	 *
	 * @param test the test
	 * @return the response entity
	 */
	@GetMapping("/test2")
	public ResponseEntity<String> sayHello(@ParameterObject final ConcreteIntParameterObject test) {
		System.out.println("Field B = " + test);
		return new ResponseEntity<String>("{\"Say\": \"Hello\"}", HttpStatus.OK);
	}

}