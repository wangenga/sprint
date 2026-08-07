package sprint;


public class WeatherStation {
    // Array size 23 covers IDs 0 through 22.
    private final String[] state = new String[23];

    public WeatherStation() {
        clearState();
    }

    public void clearState() {
        // A simple loop resets everything to "NULL" instantly
        for (int i = 0; i < state.length; i++) {
            state[i] = "NULL";
        }
    }

    public void updateState(String message) {
        if (message == null || message.isEmpty()) return;

        // Split only on the newline to get individual updates
        String[] lines = message.split("\n");
        
        for (String line : lines) {
            // OPTIMIZATION: indexOf() and substring() are much faster than split(",") 
            // because they don't use regular expressions or create intermediate arrays.
            int commaIndex = line.indexOf(',');
            
            if (commaIndex != -1) {
                int id = Integer.parseInt(line.substring(0, commaIndex));
                String value = line.substring(commaIndex + 1);
                
                // Only update if the ID falls within our known array bounds
                if (id >= 0 && id <= 22) {
                    if  (value.equals("NULL")){
                        state[id] = "NULL";
                    } else {
                        float floatValue = Float.parseFloat(value);
                        state[id] = String.valueOf(floatValue);
                    }
                    
                }
            }
        }
    }

    public String getState() {
        // Hardcoding the output structure guarantees the order is always perfect.
        // Chaining StringBuilder appends is the fastest way to build strings in Java.
        return new StringBuilder()
            .append("airTemp:").append(state[1]).append("\n")
            .append("airPressure:").append(state[2]).append("\n")
            .append("precipitation:").append(state[7]).append("\n")
            .append("windSpeed:").append(state[11]).append("\n")
            .append("windDirection:").append(state[12]).append("\n")
            .append("humidity:").append(state[13]).append("\n")
            .append("dewPoint:").append(state[14]).append("\n")
            .append("soilMoisture:").append(state[15]).append("\n")
            .append("cloudCover:").append(state[22]).append("\n")
            .toString();
    }
}