package br.com.first.unique.character.exceptions;

/**
 * The First char not found exception type
 * @author Diego Costa (diegotonzi@gmail.com)
 */
public class FirstUniqueCharNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1969035935770157045L;

	public FirstUniqueCharNotFoundException() {
        super("Unique character not found!");
    }

}
