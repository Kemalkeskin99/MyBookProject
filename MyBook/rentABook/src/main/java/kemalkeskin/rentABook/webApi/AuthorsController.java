package kemalkeskin.rentABook.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kemalkeskin.rentABook.business.abstracts.AuthorService;
import kemalkeskin.rentABook.business.requests.author.CreateAuthorRequest;
import kemalkeskin.rentABook.business.requests.author.UpdateAuthorRequest;
import kemalkeskin.rentABook.business.responses.author.GetAllAuthorResponse;
import kemalkeskin.rentABook.business.responses.author.GetByIdAuthorResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/authors")
@AllArgsConstructor
public class AuthorsController {

	private AuthorService authorService;
	
	@GetMapping
	public List<GetAllAuthorResponse> getAll(){
		return authorService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdAuthorResponse getById(@PathVariable int id) {
		return authorService.getById(id);
	}
	
	@PostMapping
	public void add(@RequestBody CreateAuthorRequest createAuthorRequest) {
		this.authorService.add(createAuthorRequest);
	}
	
	@PutMapping
	public void update( @RequestBody UpdateAuthorRequest updateAuthorRequest) {
		this.authorService.update( updateAuthorRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.authorService.delete(id);
	}
}
