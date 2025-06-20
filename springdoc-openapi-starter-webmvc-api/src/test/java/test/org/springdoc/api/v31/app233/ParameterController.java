/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  * Copyright 2019-2024 the original author or authors.
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
package test.org.springdoc.api.v31.app233;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springdoc.core.annotations.ParameterObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {

	@GetMapping("/hidden-parent")
	public void nestedParameterObjectWithHiddenParentField(@ParameterObject ParameterObjectWithHiddenField parameters) {

	}

	@GetMapping("/renamed-parent")
	public void nestedParameterObjectWithRenamedParentField(@ParameterObject ParameterObjectWithRenamedField parameters) {

	}

	@GetMapping("/optional-parent")
	public void nestedParameterObjectWithOptionalParentField(@Valid @ParameterObject MultiFieldParameterObject parameters) {

	}

	public record ParameterObjectWithHiddenField(
			@Schema(hidden = true) NestedParameterObject schemaHiddenNestedParameterObject,
			@Parameter(hidden = true) NestedParameterObject parameterHiddenNestedParameterObject,
			NestedParameterObject visibleNestedParameterObject
	) {

	}

	public record NestedParameterObject(
			String parameterField) {
	}

	public record ParameterObjectWithRenamedField(
			@Schema(name = "schemaRenamed") NestedParameterObject schemaRenamedNestedParameterObject,
			@Parameter(name = "parameterRenamed") NestedParameterObject parameterRenamedNestedParameterObject,
			NestedParameterObject originalNameNestedParameterObject
	) {

	}

	public record MultiFieldParameterObject(
			@Valid @Schema(requiredMode = RequiredMode.REQUIRED) @NotNull MultiFieldNestedParameterObject requiredNotNullParameterObject,
			@Valid @Schema(requiredMode = RequiredMode.REQUIRED) MultiFieldNestedParameterObject requiredNoValidationParameterObject,
			@Valid @Schema(requiredMode = RequiredMode.NOT_REQUIRED) @NotNull MultiFieldNestedParameterObject notRequiredNotNullParameterObject,
			@Valid @Schema(requiredMode = RequiredMode.NOT_REQUIRED) MultiFieldNestedParameterObject notRequiredNoValidationParameterObject,
			@Valid @NotNull MultiFieldNestedParameterObject noSchemaNotNullParameterObject,
			@Valid MultiFieldNestedParameterObject noSchemaNoValidationParameterObject) {

	}

	public record MultiFieldNestedParameterObject(
			@Schema(requiredMode = RequiredMode.REQUIRED) @NotNull String requiredNotNullField,
			@Schema(requiredMode = RequiredMode.REQUIRED) String requiredNoValidationField,
			@Schema(requiredMode = RequiredMode.NOT_REQUIRED) @NotNull String notRequiredNotNullField,
			@Schema(requiredMode = RequiredMode.NOT_REQUIRED) String notRequiredNoValidationField,
			@NotNull String noSchemaNotNullField,
			String noSchemaNoValidationField) {
	}

}