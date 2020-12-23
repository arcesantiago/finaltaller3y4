package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Productos implements ICrud<Producto>{

	public ArrayList<Producto> listaProductos;
	
	public Productos() {

		this.listaProductos = new ArrayList<Producto>();
	}
	
	@Override
	public void add(Producto t) {
		try {
			FileWriter csvWriter = new FileWriter("productos.csv",true);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(t.idRestoran);
		    sb.append(',');
			sb.append(this.getMaxId(t.idRestoran));
		    sb.append(',');
		    sb.append(t.nombre);
		    sb.append(',');
		    sb.append(t.precio);
		    sb.append('\n');
		    
		    csvWriter.write(sb.toString());
		    
			csvWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void delete(Producto producto) {
		try {
			File file = new File("productos.csv");
			File tempFile = new File("tempProd.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));
            
            String line;

			while((line = bufferedReader.readLine()) != null) {

			    String[] rowData = line.split(",");
			    
                if(Long.parseLong(rowData[0].trim()) == producto.idRestoran && Long.parseLong(rowData[1].trim()) == producto.id) continue;
			    bufferedWriter.write(line + System.getProperty("line.separator"));
			}
			
			bufferedReader.close();
			bufferedWriter.close();
			
			file.delete();
			tempFile.renameTo(file);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public ArrayList<Producto> getList(long idRestoran) {
		
		try {
			File file = new File("productos.csv");
			this.listaProductos.removeAll(this.listaProductos);
			
			if(file.exists()) {
				FileReader fileReader = new FileReader(file);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            String line;
	            
	            while ((line = bufferedReader.readLine()) != null) {
	            	
	                if (line.isEmpty())
	                    break;

	                String[] rowData = line.split(",");
	                long _idRestoran = Integer.parseInt(rowData[0].trim());
	                
	                if(_idRestoran == idRestoran)
	                this.listaProductos.add(new Producto(idRestoran,Long.parseLong(rowData[1].trim()),rowData[2].trim(), Long.parseLong(rowData[3].trim())));
	            }
	            
	            bufferedReader.close();
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return listaProductos;
	}



	
	public long getMaxId(long idRestoran) {
		try {
			FileReader fileReader = new FileReader("productos.csv");
		    BufferedReader bufferedReader = new BufferedReader(fileReader);
		    
		    String line;
		    int maxId = 0;
		    
		    while ((line = bufferedReader.readLine()) != null) {
		        if (line.isEmpty())
		            break;
		
		        String[] rowData = line.split(",");
		        int id = Integer.parseInt(rowData[1].trim());
		        
		        if(maxId < id)
		        	maxId = id;
		    }
		    
		    bufferedReader.close();
		    
		    return maxId + 1;
		    
		} catch (Exception e) {
			return 0;
		}
	}
}
