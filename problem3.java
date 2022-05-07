public class problem3 {
    public String getState(String x) {
        String state1 = "Normal"; //initial state
        String Instate = "Time";
        int hour = 0;
        int minute = 0;
        int day = 1;
        int month = 1;
        int year = 2000;

            switch (state1) {   //initial state
                case "Normal":
                    if (x == "c") {
                        state1 = "Update";
                        Instate = "min";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);

                    }
                    if (x == "b") {
                        state1 = "Alarm";
                        Instate = "Alarm";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                    }
                    if (x == "a") {
                        if (Instate == "Time") {
                            Instate = "Date";
                            System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        } else
                            Instate = "Time";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                    }
                    if (x == "caa") {
                        state1 = "Update";
                        Instate = "day";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        break;
                    }

                    if (x == "caaa") {
                        state1 = "Update";
                        Instate = "month";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        break;
                    }
                    if ( x == "cb") {
                        state1="Update";
                        Instate = "min";
                        minute++;
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        System.out.println("your state is current time is " + minute);
                        break;
                    }
                    if (x == "cab") {
                        state1="Update";
                        Instate = "hour";
                        hour++;
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        System.out.println("your state is current time is " + hour);
                        break;
                    }
                    if ( x == "caab") {
                        state1="Update";
                        Instate = "day";
                        day++;
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        System.out.println("your state is current time is " + day);
                        break;
                    }
                    if ( x == "caaab") {
                        state1="Update";
                        Instate = "month";
                        month++;
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        System.out.println("your state is current time is " + month);
                        break;
                    }
                    if ( x == "caaaab") {
                        state1="Update";
                        Instate = "year";
                        year++;
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        System.out.println("your state is current time is " + year);
                        break;
                    }
                    if (x == "caaa") {
                        state1 = "Update";
                        Instate = "month";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        break;
                    }
                    if (x == "caaaa") {
                        Instate = "year";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        break;
                    }
                    if (x == "caaaaa") {
                        state1 = "Normal ";
                        Instate = "Time";
                        System.out.println("your state is " + state1 + " " + "your inner state is" + " " + Instate);
                        break;
                    }
                    if(x!="a" ||x!="b" ||x!="c")
                        return "error try again";
                    break;
            }
        return state1;
    }
}







