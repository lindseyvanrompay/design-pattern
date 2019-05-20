package visiteur.vehiculeParts;

import visiteur.vehiculeParts.identification.CarRegistrationDocument;
import visiteur.vehiculeParts.identification.ConstructorPlate;
import visiteur.vehiculeParts.identification.Identification;
import visiteur.vehiculeParts.identification.NumberPlate;

public interface Visiteurs {

    void visit(Steering steering);

    void visit(Visibility visibility);

    void visit(CarRegistrationDocument carRegistrationDocument);

    void visit(ConstructorPlate constructorPlate);

    void visit(Identification identification);

    void visit(NumberPlate numberPlate);

    void visit(Breaking breaking);

    void visit(Car car);
}
