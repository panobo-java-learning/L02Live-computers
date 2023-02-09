package com.engeto.computers;

// another naming convention: camelCase, PascalCase
public class Computer {
    // Attributes: we adhere to encapsulation principle as much as possible
    ///region Attributes
    private String model;
    /*
     * public = public
     * w/o modifier = public inside the package
     * private = no one from outside (other classes) is allowed to access the value (only via special methods)
     * protected = accessible only from descendants in terms of inheritance
     */
    private double weight, diagonalOfMonitorInches;
    private boolean isCompanyComputer;
    ///endregion

    ///region Constructors
    // primitivni datove typy maji defaultni hodnotu (nejsou-li inicializovane), napr. pro int je to 0.
    // objekty vraci null. Pro nastaveni defaultnich hodnot je potreba vytvorit konstruktor.

    public Computer(String model, double weight,
                    double diagonalOfMonitor, boolean isCompanyComputer) {
        // no return type - only class name; usually is public but can also be private if I want create new objs inside the class
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitorInches = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
    }

    // better than to call multiple 'hardcoded' constructors is to call
    // one default constructor to create another constructors
    public Computer(String model, double weight) {
        this(model, weight, 13.3, true); // by calling 'default' (previous) constructor
    }

    public Computer() {
        this("ABC SuperComps", 1.2);  // calling the previous shape of constructor
    }




    ///endregions

    // pristupove metody (getters and setters). Can be generated (context menu -> generate) OR <Alt>+<Ins>
    //  -> then choose 'getters and setters'.
    ///region Access methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model; // this == related to concrete object / instance
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonalOfMonitorInches() {
        return diagonalOfMonitorInches;
    }

    public void setDiagonalOfMonitorInches(double diagonalOfMonitorInches) {
        this.diagonalOfMonitorInches = diagonalOfMonitorInches;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    ///endregion

}

