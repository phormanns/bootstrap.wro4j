package de.jalin.wro4j;

import java.io.IOException;
import java.io.InputStream;

import ro.isdc.wro.extensions.processor.css.RhinoLessCssProcessor;
import ro.isdc.wro.extensions.processor.support.less.LessCss;

public class UpdatedLessCssProcessor extends RhinoLessCssProcessor {

	@Override
	protected LessCss newLessCss() {
		return new LessCss() {
			@Override
			protected InputStream getScriptAsStream() throws IOException {
				final InputStream resourceAsStream = UpdatedLessCssProcessor.class.getResourceAsStream("less.min.js");
				return resourceAsStream;
			}
		};
	}
}
