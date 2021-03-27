package MavenTravis.MavenTravis;

import java.util.logging.Logger;

public class HelloWorld {

	public static final Logger LOGGER = Logger.getLogger("Hello, World!");
	
	public static void main(String[] args) {
		LOGGER.info(LOGGER.getName());
	}
}
