package objetos.parcial3.examen;

import java.util.LinkedList;

public class TravelAgency {
    LinkedList<UserAccount> users = new LinkedList<>();

    public String addUserAccount(UserAccount user) throws EmailRequiredException, PhoneNumberRequiredException, DuplicatedEmailsNotAllowedException, DuplicatedPhoneNumbersNotAllowedException{
        if(user.getEmail() == null) {
            throw new EmailRequiredException();
        }

        if(user.getPhoneNumber() == null) {
            throw new PhoneNumberRequiredException();
        }
        for(int i=0; i< users.size(); i++){
            user = users.get(i);
            if(user.getEmail() == users.get(i).getEmail()){
                throw new DuplicatedEmailsNotAllowedException();
            }
        }

        for(int i=0; i< users.size(); i++){
            user = users.get(i);
            if(user.getPhoneNumber() == users.get(i).getPhoneNumber()){
                throw new for(int i=0; i< users.size(); i++){
                    user = users.get(i);
                    if(user.getEmail() == users.get(i).getEmail()){
                        throw new DuplicatedPhoneNumbersNotAllowedException();
                    }
                }();
            }
        }

        users.add(user);
        return user.getzipCode();
    }

    public UserAccount findAccount(String id) throws AccountNotFoundException{
        UserAccount user = new UserAccount();

        for(int i=0; i< users.size(); i++){
           user = users.get(i);
           if(user.getzipCode() == id){
               return user;
           }
        }
        throw new AccountNotFoundException();
    }

    public UserAccount findAccountByEmail(String email) throws AccountNotFoundException{
        UserAccount user = new UserAccount();

        for(int i=0; i< users.size(); i++){
            user = users.get(i);
            if(user.getEmail() == email){
                return user;
            }
        }
        throw new AccountNotFoundException();
    }

    public UserAccount findAccountByPhoneNumber(String phoneNumber) throws PhoneNumberRequiredException{
        UserAccount user = new UserAccount();

        for(int i=0; i< users.size(); i++){
            user = users.get(i);
            if(user.getPhoneNumber() == phoneNumber){
                return user;
            }
        }
        throw new PhoneNumberRequiredException();
    }
}
