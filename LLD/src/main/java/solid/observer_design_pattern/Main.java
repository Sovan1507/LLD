package solid.observer_design_pattern;

import solid.observer_design_pattern.obervable.CellPhone;
import solid.observer_design_pattern.obervable.Observable;
import solid.observer_design_pattern.obervable.TV;
import solid.observer_design_pattern.observer.Email;
import solid.observer_design_pattern.observer.Mobile;
import solid.observer_design_pattern.observer.Observer;

public class Main {

    public static void main(String[] args) {

        Observable tv_observable = new TV();
        Observable cell_observable = new CellPhone();

        Observer email_observer = new Email("abc@test.com", tv_observable);
        Observer cell_observer = new Mobile("123456789", cell_observable);

        tv_observable.addObserver(email_observer);
        cell_observable.addObserver(cell_observer);

        ///  here the notify should be triggered when the stock is added
        tv_observable.updateData();
        cell_observable.updateData();
    }
}
