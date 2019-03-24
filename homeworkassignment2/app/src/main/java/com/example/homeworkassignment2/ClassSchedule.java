package com.example.homeworkassignment2;


import java.util.ArrayList;

public class ClassSchedule {

    private String weekNo;
    private String activity1;
    private String activity2;
    private String topic1;
    private String topic2;


    public ClassSchedule() {
    }


    public ClassSchedule(String weekNo, String activity1, String activity2, String topic1, String topic2) {
        this.weekNo = weekNo;
        this.activity1 = activity1;
        this.activity2 = activity2;
        this.topic1 = topic1;
        this.topic2 = topic2;
    }

    public String getWeekNo() {
        return weekNo;
    }

    public String getActivity1() {
        return activity1;
    }

    public String getActivity2() {
        return activity2;
    }

    public String getTopic1() {
        return topic1;
    }

    public String getTopic2() {
        return topic2;
    }

    public void setWeekNo(String weekNo) {
        this.weekNo = weekNo;
    }

    public void setActivity1(String activity) {
        this.activity1 = activity1;
    }

    public void setActivity2(String activity2) {
        this.activity2 = activity2;
    }


    public void setTopic1(String topic) {
        this.topic1 = topic1;
    }

    public void setTopic2(String topic2) {
        this.topic2 = topic2;
    }

    public static ArrayList<ClassSchedule> getDummyClass() {
        ArrayList<ClassSchedule> class1 = new ArrayList<>();
        class1.add(new ClassSchedule("Week 1: 18th February ", "Lecture 1 - Introduction & Android Fundamentals", "Lab 1 - Android Studio, Git and App Basics", " Introduction & Android Fundamentals", "Android Studio, Git and App Basics"));
        class1.add(new ClassSchedule("Week 2: 25th February ", "Lecture 2 - Activities, Lifestyles and Intents", "Lab 2 - Activities and Intents", " Activities, Lifestyles and Intents", "Activities and Intents"));
        class1.add(new ClassSchedule("Week 3: 4th March ", "Lecture 3 - Layouts & UIs", "Lab 3 - Designing a UI", " Layouts & UIs", "Designing a UI"));
        class1.add(new ClassSchedule("Week 4: 11 March ", "Lecture 4 - Lists & Adapters", "Lab 4 - Displaying Items in a List ", " Lists & Adapters", "Displaying Items in a List"));
        class1.add(new ClassSchedule("Week 5: 18th March ", "Lecture 5 - Fragments & Multi-layout Apps", "Lab 5 - Fragments for Multi-layout apps", " Fragments & Multi-layout Apps", "Fragments for Multi-layout apps"));
        class1.add(new ClassSchedule("Week 6: 25th March ", "Lecture 6 - APIs, Permissions & Libraries", "Lab 6 - APIs & JSON", " APIs, Permissions & Libraries", "APIs & JSON"));
        class1.add(new ClassSchedule("Week 7: 1st April", "Lecture 7 - Networking", "Lab 7 - Networking", " Networking", "Networking"));
        class1.add(new ClassSchedule("Week 8: 8th April", "Lecture 8 - Threads & Async Tasks", "Lab 8 - Async Tasks", " Threads & Async Tasks", "Async Tasks"));
        class1.add(new ClassSchedule("Week 9: 15th April", "Lecture 9 - Data Serving", "Lab 9 - Database", " Data Serving", "Database"));
        class1.add(new ClassSchedule("Week 10: 22nd April", "Lecture 10 - Outlook & Course Summary", "Lab 10 - Revision", " Outlook & Course Summary", "Revision"));
        return class1;
    }

}
