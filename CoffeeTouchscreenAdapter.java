public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{

    OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine){
        this.oldVendingMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        System.out.println("Adapter for first selection");
        this.oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        System.out.println("Adapter for second selection");
        this.oldVendingMachine.selectB();
    }
}
