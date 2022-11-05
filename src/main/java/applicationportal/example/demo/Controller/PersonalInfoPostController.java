package applicationportal.example.demo.Controller;
import applicationportal.example.demo.Model.PersonalinfoPost;
import applicationportal.example.demo.Repository.PersonalInfoPostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PersonalInfoPostController {
    final
    PersonalInfoPostRepository repo;

    public PersonalInfoPostController(PersonalInfoPostRepository repo) {
        this.repo = repo;
    }

    //    Fetch all personal information details
    @GetMapping("/allPersonalInformation")
    @CrossOrigin
    public List<PersonalinfoPost> getAllPersonalInformation(){
        return repo.findAll();
    }
//   Post Request
    @PostMapping("/addPersonalInformation")
    @CrossOrigin
    public PersonalinfoPost postPersonalInformation(@RequestBody PersonalinfoPost personalinfo){
        return repo.save(personalinfo);
    }

    //The function receives a DELETE request, deletes the personal info based on the ApplicantId
    @DeleteMapping("/deleterecord")
    @CrossOrigin
    public String deletePersonalDetails(@RequestParam(value = "ApplicantId") String ApplicantId) {
        return "Deleted Successfully";
    }
}
