package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.ReadingDTO;
import it.contrader.model.Reading;

public class ConverterReading {

	public static ReadingDTO toDTO(Reading reading) {
		ReadingDTO readingDTO = null;
		if (reading != null) {
			readingDTO = new ReadingDTO();
			readingDTO.setIdread(reading.getIdread());
			readingDTO.setPatcf(reading.getPatcf());
			readingDTO.setRegdev(reading.getRegdev());
			readingDTO.setMinpress(reading.getMinpress());
			readingDTO.setMaxpress(reading.getMaxpress());
			readingDTO.setMincir(reading.getMincir());
			readingDTO.setMaxcir(reading.getMaxcir());
			readingDTO.setMinbreath(reading.getMinbreath());
			readingDTO.setMaxbreath(reading.getMaxbreath());
			readingDTO.setMintemp(reading.getMintemp());
			readingDTO.setMaxtemp(reading.getMaxtemp());
			readingDTO.setPeriod(reading.getPeriod());
		}
		return readingDTO;
	}

	public static Reading toEntity(ReadingDTO readingDTO) {
		Reading reading = null;
		if (readingDTO != null) {
			reading = new Reading();
			reading.setIdread(readingDTO.getIdread());
			reading.setPatcf(readingDTO.getPatcf());
			reading.setRegdev(readingDTO.getRegdev());
			reading.setMinpress(readingDTO.getMinpress());
			reading.setMaxpress(readingDTO.getMaxpress());
			reading.setMincir(readingDTO.getMincir());
			reading.setMaxcir(readingDTO.getMaxcir());
			reading.setMinbreath(readingDTO.getMinbreath());
			reading.setMaxbreath(readingDTO.getMaxbreath());
			reading.setMintemp(readingDTO.getMintemp());
			reading.setMaxtemp(readingDTO.getMaxtemp());
			reading.setPeriod(readingDTO.getPeriod());
		}
		return reading;
	}

	public static List<ReadingDTO> toListDTO(List<Reading> list) {
		List<ReadingDTO> listReadingDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Reading reading : list) {
				listReadingDTO.add(ConverterReading.toDTO(reading));
			}
		}
		return listReadingDTO;
	}

	public static List<Reading> toListEntity(List<ReadingDTO> listReadingDTO) {
		List<Reading> list = new ArrayList<>();
		if (!listReadingDTO.isEmpty()) {
			for (ReadingDTO readingDTO : listReadingDTO) {
				list.add(ConverterReading.toEntity(readingDTO));
			}
		}
		return list;
	}
}