package xzx;
public class AddressBookEntry {
    private String name;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String zipcode;

    public AddressBookEntry(String name, String address, String phoneNumber, String birthday,String zipcode) {
        this.name = name;
        this.address = address;
        this.address = zipcode;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getZipcode() {
        return zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPostal Code: " + zipcode+ "\nPhone number: " + phoneNumber + "\nBirthday: " + birthday + "\n";
    }
}