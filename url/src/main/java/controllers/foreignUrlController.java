package controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import models.ListWazirxClass;
import models.WazirxClass;
import models.coinInfo;
import services.ReadCsvObjects;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class foreignUrlController {
	
	//@Autowired
	ReadCsvObjects readObjectsFromCsv = new ReadCsvObjects();

	@RequestMapping(value="/upers")
	public ResponseEntity<coinInfo> getVals(){
		
		return new ResponseEntity<>(new coinInfo().builder()
				.id(UUID.randomUUID())
				.currentVal(222.1)
				.yesterdayVal(211.3)
				.avg5days(203.4)
				.build(), HttpStatus.OK);
	}
	@RequestMapping(value="/csv1")
	public ResponseEntity<List<Map<String, String>>> getCsvVal1(){
		
        List<Map<String, String>> data = new ArrayList<>();
        try {
			data = readObjectsFromCsv.readObjectsFromCsv();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value="/currentDate")
	public ResponseEntity<List<Map<String, String>>> getCsvValCurrentDate(){
		
        List<Map<String, String>> data = new ArrayList<>();
        try {
			data = readObjectsFromCsv.readObjectsFromCsvCurrentDate("currentDate");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@RequestMapping(value="/minus1")
	public ResponseEntity<List<Map<String, String>>> getCsvValMinusOne(){
		
        List<Map<String, String>> data = new ArrayList<>();
        try {
			data = readObjectsFromCsv.readObjectsFromCsvMinusOne("minus1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new ResponseEntity<>(data,HttpStatus.OK);
	}
	@RequestMapping(value="/foreignUrlAll")
	public ResponseEntity<WazirxClass[]> getAll(){
		String str ="https://api.wazirx.com/sapi/v1/tickers/24hr";// "https://api.wazirx.com/sapi/v1/ticker/24hr?symbol=wrxinr";
		RestTemplate rt = new RestTemplate();
		WazirxClass[] wxcl = rt.getForObject(str, WazirxClass[].class);
		List<WazirxClass> listValues = new ArrayList<WazirxClass>(Arrays.asList(wxcl)); 
		ResponseEntity<WazirxClass[]> re = new ResponseEntity<>(wxcl,HttpStatus.OK);
		return re;
	}
}