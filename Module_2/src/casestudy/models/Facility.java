package casestudy.models;

public class Facility {
    private String idFacility;
    private String nameService;
    private double areaUse;
    private int rentalPrice;
    private int rentalPeopleMax;
    private String styleRental;

    public Facility() {
    }

    public Facility(String idFacility,
                    String nameService
                    ,double areaUse,
                    int rentalPrice,
                    int rentalPeopleMax,
                    String styleRental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentalPrice=" + rentalPrice +
                ", rentalPeopleMax=" + rentalPeopleMax +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
