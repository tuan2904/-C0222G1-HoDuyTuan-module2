package casestudy.models;

public class Room extends Facility {
    private String buffet;
    private String standard;

    public Room(String standard,String buffet) {
        this.standard = standard;
        this.buffet = buffet;
    }

    public Room(String idFacility,
                String nameService,
                double areaUse,
                int rentalPrice,
                int rentalPeopleMax,
                String styleRental,
                String standard,
                String buffet) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.buffet = buffet;
        this.standard = standard;
    }

    public Room() {
    }

    public String getBuffet() {
        return buffet;
    }

    public void setBuffet(String buffet) {
        this.buffet = buffet;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "buffet='" + buffet + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}
