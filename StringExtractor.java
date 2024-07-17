public class StringExtractor {
    public static String getString(String str){
        String getNumber;
        getNumber = str.replaceAll("[a-z|A-Z]", "");
        if("".equalsIgnoreCase(getNumber)){
            getNumber = "0.00";
        }else if(getNumber.indexOf(".") == -1){
            getNumber = getNumber+".00";
        } else {
            if(getNumber.indexOf(".")== getNumber.length()-1){
                getNumber = getNumber+"00";
            } else if (getNumber.indexOf(".")== getNumber.length()-2){
                getNumber = getNumber+"0";
            } else {
                getNumber = getNumber.substring(0, getNumber.indexOf(".")+3);
            }
        }
        return getNumber;
    }
    public static void main(String[] args) {
        String str1 = "abcd123.456";
        String str2 = "abcd123";
        System.out.println(getString(str1));
        System.out.println(getString(str2));
        System.out.println(getString("123.1"));
        System.out.println(getString("abc"));
        System.out.println(getString("1231.1"));
        System.out.println(getString("abcd123.456ab"));
        System.out.println(getString("abcd123.456ab"));
        System.out.println(getString("123.456ab"));
        System.out.println(getString("1"));
    }


}
