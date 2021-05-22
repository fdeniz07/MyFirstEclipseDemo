package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data,true, message); //base class'a 3 parametreden birini; true bilgisini manuel yolluyoruz
	}
	
	
	public SuccessDataResult(T data) {
		super(data, true); //base class'a 2 parametreden birini; true bilgisini manuel yolluyoruz
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message); //base class'a 3 parametreden ikisini manuel yolluyoruz
	}
	
	public SuccessDataResult() {
		super(null, true); //base class'a 2 parametreden ikisini manuel yolluyoruz
	}
	
}
