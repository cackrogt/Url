package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ReadCsvObjects {
	
	String filePath = "D:/movies/Programs/currentDate/first.csv";
	String filePathCurrent = "D:/movies/Programs/currentDate/";
	String filePathMinusOne = "D:/movies/Programs/minus1/";
	String filePathMinusTwo = "D:/movies/Programs/minus2/";
	String filePathMinusThree = "D:/movies/Programs/minus3/";
	//List<Map<String, String>> result = null;

	
	/*
	 * public static List<Map<?, ?>> readObjectsFromCsv(File file) throws
	 * IOException { CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
	 * CsvMapper csvMapper = new CsvMapper(); MappingIterator<Map<?, ?>>
	 * mappingIterator =
	 * csvMapper.reader(Map.class).with(bootstrap).readValues(file);
	 * 
	 * return mappingIterator.readAll(); }
	 * 
	 * public static void writeAsJson(List<Map<?, ?>> data, File file) throws
	 * IOException { ObjectMapper mapper = new ObjectMapper();
	 * mapper.writeValue(file, data); }
	 */
	public String[] header(String filePath) throws FileNotFoundException, IOException {
		try (
			BufferedReader br = new BufferedReader(new FileReader(filePath))){
			return br.readLine().split(",");
		} 
	}
	
	public List<Map<String, String>> readObjectsFromCsv() throws IOException {
		List<Map<String, String>> result = new ArrayList<>();
		String[] header = this.header(filePath);
		try(Stream<String> stream = Files.lines(Paths.get(filePath))){
		result = stream
				.skip(1)
				.map(line-> line.split(","))
				.map(data->{
					Map<String, String> eachrow = new HashMap<>();
					for(int i =0; i< data.length; i++) {
						eachrow.put(header[i],data[i]);
						System.out.println(data[i]);
					}
					return eachrow;
				})
				.collect(Collectors.toList());
		}
		return result;
	}
	
	public List<Map<String, String>> readObjectsFromCsvCurrentDate(String folderName) throws IOException {
		List<Map<String, String>> result = new ArrayList<>();
		String currentDatedFiles = filePathCurrent + "first.csv";
		String[] header = this.header(currentDatedFiles);
		try(Stream<String> stream = Files.lines(Paths.get(currentDatedFiles))){
		result = stream
				.skip(1)
				.map(line-> line.split(","))
				.map(data->{
					Map<String, String> eachrow = new HashMap<>();
					for(int i =0; i< data.length; i++) {
						eachrow.put(header[i],data[i]);
						System.out.println(data[i]);
					}
					return eachrow;
				})
				.collect(Collectors.toList());
		}
		return result;
	}
	
	public List<Map<String, String>> readObjectsFromCsvMinusOne(String folderName) throws IOException {
		List<Map<String, String>> result = new ArrayList<>();
		String minusOne = filePathCurrent + "first.csv";
		String[] header = this.header(minusOne);
		try(Stream<String> stream = Files.lines(Paths.get(minusOne))){
		result = stream
				.skip(1)
				.map(line-> line.split(","))
				.map(data->{
					Map<String, String> eachrow = new HashMap<>();
					for(int i =0; i< data.length; i++) {
						eachrow.put(header[i],data[i]);
						System.out.println(data[i]);
					}
					return eachrow;
				})
				.collect(Collectors.toList());
		}
		return result;
	}
}
