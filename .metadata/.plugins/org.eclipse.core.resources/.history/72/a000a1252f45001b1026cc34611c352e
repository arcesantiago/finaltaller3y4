package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Restoranes implements ICrud<Restoran>{
	
	public ArrayList<Restoran> listaRestoranes;
	

	public Restoranes() {
		this.listaRestoranes = new ArrayList<Restoran>();
	}
	
	@Override
	public void add(Restoran t) {
		
		try {
			FileWriter csvWriter = new FileWriter("restoranes.csv",true);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(this.getMaxId());
		    sb.append(',');
		    sb.append(t.nombre);
		    sb.append('\n');
		    
		    csvWriter.write(sb.toString());
		    
			csvWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void delete(Restoran restoran) {
		try {
			File file = new File("restoranes.csv");
			File tempFile = new File("temp.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));
            
            String line;

			while((line = bufferedReader.readLine()) != null) {

			    String[] rowData = line.split(",");
			    
                if(Long.parseLong(rowData[0].trim()) == restoran.id) continue;
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

	
	public ArrayList<Restoran> getList() {
		
		try {
			File file = new File("restoranes.csv");
			this.listaRestoranes.removeAll(this.listaRestoranes);
			
			if(file.exists()) {
				FileReader fileReader = new FileReader(file);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            String line;
	            
	            while ((line = bufferedReader.readLine()) != null) {
	            	
	                if (line.isEmpty())
	                    break;

	                String[] rowData = line.split(",");
	                long id = Integer.parseInt(rowData[0].trim());
	                
	                
	                this.listaRestoranes.add(new Restoran(id,rowData[1].trim()));
	            }
	            
	            bufferedReader.close();
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
			return listaRestoranes;
	}

	
	public long getMaxId() {
		
		try {
			FileReader fileReader = new FileReader("restoranes.csv");
		    BufferedReader bufferedReader = new BufferedReader(fileReader);
		    
		    String line;
		    int maxId = 0;
		    
		    while ((line = bufferedReader.readLine()) != null) {
		        if (line.isEmpty())
		            break;
		
		        String[] rowData = line.split(",");
		        int id = Integer.parseInt(rowData[0].trim());
		        
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
