package seedu.address.model.wedding.exceptions;

/**
 * Signals that the operation will result in duplicate Weddings.
 */
public class DuplicateWeddingException extends RuntimeException {
    public DuplicateWeddingException() {
        super("Operation would result in duplicate weddings");
    }
}
