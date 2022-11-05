package applicationportal.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

//MongoDB collection name
@Document(collection = "PersonalInfo")
public class PersonalinfoPost {
    @Id private String ApplicantId;
    private String Title;
    private String FirstName;
    private String PreferredName;
    private String Surname;
    private Date DOB;
    private String Email;
    private int PhoneNumber;
    private String Gender;
    private String Country;
    private String County;
    private String Address;

    public PersonalinfoPost() {
    }

    public String getApplicantId() {
        return ApplicantId;
    }

    public void setApplicantId(String applicantId) {
        ApplicantId = applicantId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getPreferredName() {
        return PreferredName;
    }

    public void setPreferredName(String preferredName) {
        PreferredName = preferredName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "PersonalinfoPost{" +
                "ApplicantId='" + ApplicantId + '\'' +
                ", Title='" + Title + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", PreferredName='" + PreferredName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", DOB=" + DOB +
                ", Email='" + Email + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Gender='" + Gender + '\'' +
                ", Country='" + Country + '\'' +
                ", County='" + County + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
