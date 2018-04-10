public class public_Hello_World {
    public public_Hello_World (String intro) {
        this.intro = intro;
    };

    public void setIntro(String s) {
        intro = s;
    }

    public String getIntro() {
        return intro;
    }

    private String intro;

    public static void main(String[] args) {
        public_Hello_World java = new public_Hello_World("Hello, World");
        System.out.println(java.getIntro());

        java.setIntro("04/10/2018");
        System.out.println(java.getIntro());
    }
}
