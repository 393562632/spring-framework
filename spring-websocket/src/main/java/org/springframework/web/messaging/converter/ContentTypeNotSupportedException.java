/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.messaging.converter;

import org.springframework.http.MediaType;


/**
 * @author Rossen Stoyanchev
 * @since 4.0
 */
public class ContentTypeNotSupportedException extends Exception {

	private final MediaType mediaType;

	private final Class<?> sourceOrTargetType;


	public ContentTypeNotSupportedException(MediaType mediaType, Class<?> sourceOrTargetType) {
		super("Content type '" + mediaType + "' not supported");
		this.mediaType = mediaType;
		this.sourceOrTargetType = sourceOrTargetType;
	}

	public MediaType getMediaType() {
		return this.mediaType;
	}

	public Class<?> getSourceOrTargetType() {
		return this.sourceOrTargetType;
	}

}