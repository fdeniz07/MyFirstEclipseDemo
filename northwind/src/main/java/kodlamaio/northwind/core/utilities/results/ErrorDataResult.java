package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String message) {
		super(data, false, message); // base class'a 3 parametreden birini; false bilgisini manuel yolluyoruz
	}

	public ErrorDataResult(T data) {
		super(data, false); // base class'a 2 parametreden birini; false bilgisini manuel yolluyoruz
	}

	public ErrorDataResult(String message) {
		super(null, false, message); // base class'a 3 parametreden ikisini manuel yolluyoruz
	}

	public ErrorDataResult() {
		super(null, false); // base class'a 2 parametreden ikisini manuel yolluyoruz
	}

}
