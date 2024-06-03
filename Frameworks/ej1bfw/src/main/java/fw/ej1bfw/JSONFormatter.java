package fw.ej1bfw;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import org.json.simple.JSONObject;

public class JSONFormatter extends SimpleFormatter{

	@SuppressWarnings("unchecked")
	@Override
	public String format(LogRecord record) {
		JSONObject json= new JSONObject();
		json.put("message", record.getMessage());
		json.put("level:", record.getLevel());
		return json.toString();
	}
}
