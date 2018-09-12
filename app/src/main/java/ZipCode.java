public class ZipCode {
    private final String code;
    private final String city;

    public ZipCode(String code, String city){
        this.code = code;
        this.city =city;

    }

    public String getCode() {
        return code;
    }
    public String getCity(){
    return city;
    }
    public String toString(){
    return getCode() + " " + getCity();
    ]

    }