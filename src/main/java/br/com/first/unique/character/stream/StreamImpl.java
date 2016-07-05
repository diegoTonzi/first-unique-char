package br.com.first.unique.character.stream;

/**
 * The Stream type
 * @author Diego Costa (diegotonzi@gmail.com)
 */
public class StreamImpl implements Stream {

    private final String input;
    private Integer count;
    private final Integer size;

    /**
     * Constructs a new Stream
     * @param input
     */
    public StreamImpl(String input) {
        this.input = input;
        this.size = input.length();
        this.count = 0;
    }

    @Override
    public char getNext() {
        char next = input.charAt(count);
        this.count++;
        return next;
    }

    @Override
    public boolean hasNext() {
        return this.count < this.size;
    }

}
