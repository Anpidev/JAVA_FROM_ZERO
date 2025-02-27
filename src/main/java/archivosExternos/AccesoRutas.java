package archivosExternos;

import java.io.File;


public class AccesoRutas {

	public static void main(String[] args) {
		File directorio = new File("archivo");
		System.out.println(directorio.getAbsolutePath());
		System.out.println(directorio.exists());
		
		File directorio2 = new File("/media/anpiarur/USB-DATA/empleo");
		
		/*Para asegurar que no haya errores en la ruta por diferentes OS podemos hacer lo siguiente:
		 * File.separator+"media"+File.separator+"anpiarur"+File.separator+"USB-DATA"+File.separator+"empleo"
		 * Asi no hay problemas ya que UNIX usa /  y por ejemplo WINDOWS usa \
		 */
		
		String [] lista=directorio2.list();
		for (String string : lista) {
				System.out.println(string);
			File subdirectorio = new File(directorio2.getAbsolutePath(),string);
			if (subdirectorio.isDirectory()) {
				String [] subcarpeta =subdirectorio.list();
				for (String string2 : subcarpeta) {
					System.out.println(string2);
				}
			}
		
		}
		
		
	}

}
