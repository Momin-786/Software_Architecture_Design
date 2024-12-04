import controller.CarController;
import model.CarModel;
import view.CarView;

public class Main {
    public static void main(String[] args) {
        CarModel model = new CarModel();
        CarView view = new CarView();
        CarController controller = new CarController(model, view);
        controller.setCarData("Tesla", "Model S", 2022, "Yellow", "Electric", 792723.99);
        controller.updateView();
    }
}
