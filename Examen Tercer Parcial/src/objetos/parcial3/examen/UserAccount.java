package objetos.parcial3.examen;

public class UserAccount {
    private String email;
    private String name;
    private String zipcode;
    private String phoneNumber;

    public void buildUserAccount(String email, String name, String zipcode, String phoneNumber){
        this.email = email;
        this.name = name;
        this. zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }

    public String getzipCode(){
        return this.zipcode;
    }

    public String getEmail(){
        return this.email;
    }

    public String getId(){
        return this.zipcode;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }



}
