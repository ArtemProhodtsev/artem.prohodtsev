import com.artpro.model.Car;
import com.artpro.model.GasTank;
import com.artpro.model.Motor;
import com.artpro.service.CarService;
import com.artpro.service.CarServiceImplements;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImplements(createCar()); //создали новый объект carService на основе CarServiceImplements и будем туда
        //в качестве параметра createCar() будем ложить объект, метод описан ниже
        carService.distanceCarPassedForAllTime(); //1.4 вызвали наш метод
    }

    private static Car createCar() { //создали метод в котором будем создавать наш объект - Машина и заполнять поля
        Car car = new Car(new Motor("benzin"), new GasTank(100)); //Кар - кар!
        car.setDistanceCarPassedForAllTime(100);
        return car;
    }
}

