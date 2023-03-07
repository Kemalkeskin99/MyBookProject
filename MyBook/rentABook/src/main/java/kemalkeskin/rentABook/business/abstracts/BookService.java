package kemalkeskin.rentABook.business.abstracts;

import java.util.List;

import kemalkeskin.rentABook.business.requests.book.CreateBookRequest;
import kemalkeskin.rentABook.business.responses.book.GetAllBookResponse;
import kemalkeskin.rentABook.business.responses.book.GetByIdBookResponse;

public interface BookService {

	List<GetAllBookResponse>getAll();
	GetByIdBookResponse getById(int id);
	void add(CreateBookRequest createBookRequest);
}
