public class Notification {

    public String getNotification (String category) {
        //based on category display specific notification content
        return "Json object";
         /*Json to be returned [
            "notificationName: Notification name to be displayed on UI";
            "Blog Link: notification details";
            "Image Link: image with engraved notification details"
                    ]*/
    }

    public String addNotification (String notificationName, String blogLink, String Category, String imageLink) {
        //Add all these details to db and return 200 ok
        return "200 ok";
    }

    public String deleteNotification (String notificationName) {
        //delete the notification for the received notificationame
        return "200 ok";
    }

}
