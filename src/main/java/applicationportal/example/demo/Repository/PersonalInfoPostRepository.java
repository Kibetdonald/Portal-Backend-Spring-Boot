package applicationportal.example.demo.Repository;

import applicationportal.example.demo.Model.PersonalinfoPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonalInfoPostRepository extends MongoRepository<PersonalinfoPost, String> {
}
