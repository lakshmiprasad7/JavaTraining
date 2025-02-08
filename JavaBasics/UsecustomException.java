package JavaBasics;

class InvalidageException extends Exception {
	public InvalidageException(String message) {
		super(message);
	}
}

class UsecustomException {

	static void validage(int age) throws InvalidageException {
		if (age < 18) {
			throw new InvalidageException("age must be greater than 18 to open bank account");
		} else {
			System.out.println("Valid age to open account");
		}
	}

	 public static void main(String args[]) {
		try {
			validage(15);
		} catch (InvalidageException e) {
			System.out.println(e.getMessage());
		}
	}
}

