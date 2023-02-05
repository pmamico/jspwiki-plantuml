package hu.pmamico.jspwiki.plugin;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.wiki.WikiContext;
import org.apache.wiki.api.exceptions.PluginException;
import org.apache.wiki.api.plugin.WikiPlugin;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;


public class PlantUmlPlugin implements WikiPlugin {

	private static final Logger log = Logger.getLogger(PlantUmlPlugin.class);

	@Override
	public String execute(WikiContext wikiContext, Map<String, String> params) throws PluginException {
		log.info("start");
		String svg = "";
		try {
			String body = params.get("_body");

			if (body == null || "".equals(body.trim())) {
				return "Try something like this:<br>" +
						"[{plantuml<br><br>" +
						"start<br>" +
						":Hello world;<br>" +
						"stop" +
						"<br>}]<br>" +
						"Note: you HAVE to skip one line after '[{plantuml' definition.<br>" +
						"PlantUml language specification: <a href='https://plantuml.com/sitemap-language-specification'>plantuml.com</a>";
			} else if (!body.trim().startsWith("@startuml")) {
				body = "@startuml\n" + body + "\n@enduml";
			}

			SourceStringReader reader = new SourceStringReader(body);
			final ByteArrayOutputStream os = new ByteArrayOutputStream();
			reader.outputImage(os, new FileFormatOption(FileFormat.SVG)).getDescription();
			os.close();
			svg = new String(os.toByteArray(), StandardCharsets.UTF_8);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return svg;
	}

}