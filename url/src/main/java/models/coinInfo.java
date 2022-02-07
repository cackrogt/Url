package models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class coinInfo {
	private UUID id;
	private double currentVal;
	private double yesterdayVal;
	private double avg5days;
	
}
