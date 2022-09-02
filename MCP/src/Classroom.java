public class Classroom {

    public String getRecordedcontents (String param) {
        //if param is all
        if (param == "all") {
            return "all the data available for recorded contents table";
        }
        else
            return "data table based on the param passed";
    }

    public String postRecordedcontents (String ContentName, String tag, String url) {
        // put the received url to mapped to ContentName in the classroom: recorded table
        return "200: ok";
    }

    public void deleteRecordedcontents(String ContentName)
    {
        deleteRecordedcontents("");

    }

    public String getClassLink() {
        return "google meet link";
    }

}
