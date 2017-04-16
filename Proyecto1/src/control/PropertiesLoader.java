package control;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
/**
 *
 * @author DrkSprtn
 */
public class PropertiesLoader {
public Properties cargarProperties() throws IOException{
        Properties prop = new Properties();
	InputStream input = null;
        try {

		input = new FileInputStream("config.properties");

		
		prop.load(input);


	} catch (IOException ex) {
            ex.printStackTrace();
       
    }
        return prop;
    }
    public void asignarPropiedades() throws FileNotFoundException, IOException{
        Properties prop = new Properties();
	OutputStream output = null;

		output = new FileOutputStream("config.properties");

		prop.setProperty("idSolicitudes", "1");

		prop.store(output, null);
}    
}
