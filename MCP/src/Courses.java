public class Courses {
    public String getAllCourses(String value) {
        if (value == "all") {
            return "all the data available in the courses table (all the courses name)";
        } else
            getValueSpecificdata(value);
            return "value specific to the value passed in the param";
    }

    private void getValueSpecificdata(String value) {
        //return the data associated with the value
        /*response exmaple:
        response{
            "url": "googledrive.com";
            "paper"[
                    {
                        "Question1": "what is java";
                        "option1": "A";
                        "option2": "b";
                        "option3": "c";
                        "option4": "d";
                        "Answer": "A";
                    },
            {
                "Question2": "what is oops";
                "option1": "A";
                "option2": "b";
                "option3": "c";
                "option4": "d";
                "Answer": "A";
            }]
        }*/
    }
}
