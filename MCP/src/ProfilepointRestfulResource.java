public class ProfilepointRestfulResource {

    public String getProfile(String input) {
        if (input.equals("username")) {
            return "username";
        }
        else if (input.equals("all")) {
            return "username";
        }
        return "";
    }

    public String setProfile(String input) {
        //put all the data received in input into db
        // this would be used during create profile by admin
        return "success: added successfulle";
    }

}
