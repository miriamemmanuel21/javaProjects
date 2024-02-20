import java.util.ArrayList;
import java.util.List;

class Users {
    int age;
    String email_address;
    String home_address;
    String name;
    String password;
    String phone;

    public Users(int age, String email_address, String home_address, String name, String password, String phone) {
        this.age = age;
        this.email_address = email_address;
        this.home_address = home_address;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
}

class Customers extends Users {
    List<BillingInfo> billing_info;
    List<Items> shopping_cart;

    public Customers(int age, String email_address, String home_address, String name, String password, String phone) {
        super(age, email_address, home_address, name, password, phone);
        this.billing_info = new ArrayList<>();
        this.shopping_cart = new ArrayList<>();
    }
}

class Sellers extends Users {

    public Sellers(int age, String email_address, String home_address, String name, String password, String phone) {
        super(age, email_address, home_address, name, password, phone);
    }
}

class Addresses {
    String city_name;
    String country_name;
    String house_number;
    String street;
    String state;

    public Addresses(String city_name, String country_name, String house_number, String street, String state) {
        this.city_name = city_name;
        this.country_name = country_name;
        this.house_number = house_number;
        this.street = street;
        this.state = state;
    }
}

class Items {
    int quantity;
    String product;

    public Items(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }
}

class ProductCategory {
    String category_name;

    public ProductCategory(String category_name) {
        this.category_name = category_name;
    }
}

class BillingInfo {
    String receiver_phone;
    String receiver_name;
    String delivery_address;
    String credit_card_info;

    public BillingInfo(String receiver_phone, String receiver_name, String delivery_address, String credit_card_info) {
        this.receiver_phone = receiver_phone;
        this.receiver_name = receiver_name;
        this.delivery_address = delivery_address;
        this.credit_card_info = credit_card_info;
    }
}

