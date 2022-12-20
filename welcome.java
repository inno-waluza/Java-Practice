class welcome{
    static String hello = "we missed you here, where were you";
    static String reply = "Yeah its been a while indeed, but am back now";
    public String welcomeQuestion(String hello){
        return hello;
    }

    public String replyAns(String reply){
        return reply;
    }

    public static void main(String[] args){
        welcome welc = new welcome();
        System.out.println(welc.welcomeQuestion(hello));
        System.out.println(welc.replyAns(reply));
    }
}