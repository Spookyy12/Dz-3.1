public class BmiService {

    public int calculate (int weight , double growth ){
        // BMI = kg/m2

        return  (int) ( weight / (growth * growth));

    }
}
