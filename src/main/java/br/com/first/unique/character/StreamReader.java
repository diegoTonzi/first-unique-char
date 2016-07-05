package br.com.first.unique.character;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.first.unique.character.exceptions.FirstUniqueCharNotFoundException;
import br.com.first.unique.character.stream.Stream;

/**
 * The Stream reader type
 * @author Diego Costa (diegotonzi@gmail.com)
 */
public class StreamReader {

	/**
	 * Gets the first unique char from stream
	 * @param input Stream
	 * @return the first unique char of stream
	 */
    public static char firstChar(Stream input) {
        Map<Character,Integer> map = mapChars(input);
        Character character = getFirstUniqueChar(map);
        if(character == null) {
            throw new FirstUniqueCharNotFoundException();
        }
        return character;
    }

    private static Map<Character,Integer> mapChars(Stream input) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        while (input.hasNext()) {
            char character = input.getNext();
            map.put(character, map.containsKey(character) ? map.get(character) + 1 : 1);
        }
        return map;
    }

    private static Character getFirstUniqueChar(Map<Character, Integer> map) {
        Character character = null;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                character = entry.getKey();
                break;
            }
        }
        return character;
    }
}
