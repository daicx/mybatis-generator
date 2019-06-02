package com.example.mybatisgenerator.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MysqlTypeConvert {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Shanghai");
		System.out.println(Instant.now().atZone(zoneId));
		System.out.println(LocalDate.now(zoneId));
		System.out.println(LocalDateTime.now(zoneId).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
	}
}
