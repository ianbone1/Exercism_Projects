import java.util.ArrayList;
import java.util.LinkedHashMap;

class ResistorColor {

    private LinkedHashMap<String, Integer> map;

    public ResistorColor(){
        map = new LinkedHashMap<>();
        map.put("black" , 0);
        map.put("brown" , 1);
        map.put("red"   , 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green" , 5);
        map.put("blue"  , 6);
        map.put("violet", 7);
        map.put("grey"  , 8);
        map.put("white" , 9);
    }

    int colorCode(String color) {
        return map.get(color);
    }

    String[] colors() {
        ArrayList<String> colorList = new ArrayList<String>();
        map.forEach((k, v) -> {
            colorList.add(k);
        });
        return colorList.toArray(new String[0]);
    }
}
