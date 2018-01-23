package com.custom.deserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomDateDeserializer extends JsonDeserializer<Date> {

	/**
	 * format and deserialize date
	 * 
	 * @param parser
	 * @param context
	 */
	@Override
	public Date deserialize(JsonParser parser, DeserializationContext context) throws IOException {

		System.out.println("Inside Deserializer");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;

		try {
			String dateStr = parser.getText();

			if (dateStr != null && !dateStr.isEmpty()) {
				date = formatter.parse(parser.getText());
			}
		} catch (ParseException e) {
			throw new JsonParseException("Invalid date format", null, e);
		}
		return date;
	}

}