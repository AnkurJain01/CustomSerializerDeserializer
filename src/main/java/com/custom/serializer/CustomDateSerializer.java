package com.custom.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Date Serializer
 * 
 * @author 
 *
 */
public class CustomDateSerializer extends JsonSerializer<Date> {

	/**
	 * format and serialize date
	 * 
	 * @param date
	 * @param jsonGenerator
	 * @param provider
	 */
	@Override
	public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {

		System.out.println("Inside Serializer");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = formatter.format(date);

		jsonGenerator.writeString(formattedDate);
	}
}