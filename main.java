public class main {
    public static void main(String[] args) {
        
        model m = new model();
        view v = new view();
        control c = new control(m, v);
        c.setdata("Hello momin here");
        c.updateview();
    }
}
