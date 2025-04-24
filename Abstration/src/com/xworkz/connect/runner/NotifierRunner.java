package com.xworkz.connect.runner;
import com.xworkz.connect.internal.EmailNotifier;
import com.xworkz.connect.internal.NotificationApp;
import com.xworkz.connect.internal.Notifier;
import com.xworkz.connect.internal.SmsNotifier;
public class NotifierRunner {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.save();

        Notifier smsNotifier = new SmsNotifier();
        smsNotifier.save();

        NotificationApp app = new NotificationApp(emailNotifier);
        app.details();
    }
}
