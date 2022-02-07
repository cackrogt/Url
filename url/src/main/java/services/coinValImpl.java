package services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import models.coinInfo;

@Service
public class coinValImpl {
	public coinInfo getCoinByUid(UUID coin) {
		return new coinInfo().builder()
				.id(UUID.randomUUID())
				.currentVal(222.1)
				.yesterdayVal(211.3)
				.avg5days(203.4)
				.build();
	}
}
