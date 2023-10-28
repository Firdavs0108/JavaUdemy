public class User {

    private String username;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) { 
        if (age < 0) {
            throw new IllegalArgumentException("Aga cannot be negative");
        }
    }

    public String getUsername() {
        // return this.username;
        try {
          return this.username;  
        }catch(Exception e){
                e.printStackTrace();
                return null;
        }
    }

    public void setUsername(String username) {
        // this.username = username;
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank");
            
        }
    }


}
