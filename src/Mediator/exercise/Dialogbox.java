package Mediator.exercise;

public class Dialogbox {
    TextboxExercise username = new TextboxExercise();
    TextboxExercise password = new TextboxExercise();
    CheckboxExercise TandC = new CheckboxExercise();
    ButtonExercise login = new ButtonExercise();

    public Dialogbox() {
        username.attach(this::isLogin);
        password.attach(this::isLogin);
        TandC.attach(this::isLogin);
    }

    public void isLogin() {
        login.setEnabled(username.getContent() != null && username.getContent().equals("Soumya") && password.getContent() != null && password.getContent().equals("12345") && TandC.isChecked());

    }

    public void simulateSituation() {
        username.setContent("Soumya");
        password.setContent("12345");
        TandC.setChecked(true);
        System.out.println("is logged in:" + login.isEnabled());
        username.setContent("Soumya1");
        System.out.println("is logged in:" + login.isEnabled());
        username.setContent("Soumya");
        password.setContent("1234");
        System.out.println("is logged in:" + login.isEnabled());
        username.setContent("Soumya");
        password.setContent("1234");
        TandC.setChecked(false);
        System.out.println("is logged in:" + login.isEnabled());

    }

    public static void main(String[] args) {
        Dialogbox d = new Dialogbox();
        d.simulateSituation();
    }

}
