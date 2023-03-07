package kemalkeskin.rentABook.business.requests.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest {

	private String bookName;
	private double bookPrice;
	private int authorId;
}
