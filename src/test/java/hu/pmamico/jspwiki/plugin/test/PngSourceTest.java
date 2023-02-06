package hu.pmamico.jspwiki.plugin.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import hu.pmamico.jspwiki.plugin.PlantUmlPlugin;

public class PngSourceTest {


	@Test
	public void getLinkFromSvg(){
		//GIVEN
		String svg = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" contentStyleType=\"text/css\" height=\"137px\" preserveAspectRatio=\"none\" style=\"width:108px;height:137px;background:#FFFFFF;\" version=\"1.1\" viewBox=\"0 0 108 137\" width=\"108px\" zoomAndPan=\"magnify\"><defs/><g><ellipse cx=\"54\" cy=\"20\" fill=\"#222222\" rx=\"10\" ry=\"10\" style=\"stroke:#222222;stroke-width:1.0;\"/><rect fill=\"#F1F1F1\" height=\"34.1328\" rx=\"12.5\" ry=\"12.5\" style=\"stroke:#181818;stroke-width:0.5;\" width=\"86\" x=\"11\" y=\"50\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"12\" lengthAdjust=\"spacing\" textLength=\"66\" x=\"21\" y=\"71.6016\">Hello World</text><ellipse cx=\"54\" cy=\"115.1328\" fill=\"none\" rx=\"11\" ry=\"11\" style=\"stroke:#222222;stroke-width:1.0;\"/><ellipse cx=\"54\" cy=\"115.1328\" fill=\"#222222\" rx=\"6\" ry=\"6\" style=\"stroke:#111111;stroke-width:1.0;\"/><line style=\"stroke:#181818;stroke-width:1.0;\" x1=\"54\" x2=\"54\" y1=\"30\" y2=\"50\"/><polygon fill=\"#181818\" points=\"50,40,54,50,58,40,54,44\" style=\"stroke:#181818;stroke-width:1.0;\"/><line style=\"stroke:#181818;stroke-width:1.0;\" x1=\"54\" x2=\"54\" y1=\"84.1328\" y2=\"104.1328\"/><polygon fill=\"#181818\" points=\"50,94.1328,54,104.1328,58,94.1328,54,98.1328\" style=\"stroke:#181818;stroke-width:1.0;\"/><!--SRC=[Aov9B2hXil98pSd9LmZFByf9iUOgBialu080]--></g></svg>";
		PlantUmlPlugin plugin = new PlantUmlPlugin();

		//WHEN
		String pngLink = plugin.getPngSource(svg);

		//THEN
		assertEquals("https://www.plantuml.com/plantuml/png/Aov9B2hXil98pSd9LmZFByf9iUOgBialu080", pngLink);
	}
}
