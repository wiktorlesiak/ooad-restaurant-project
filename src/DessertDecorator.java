public abstract class DessertDecorator implements DessertInterface {

    protected Dessert decoratorDessert;

    public DessertDecorator(Dessert decoratorDessert){
        this.decoratorDessert = decoratorDessert;
    }

    public void cake(){
        decoratorDessert.getCake1();
        decoratorDessert.getCake2();
        decoratorDessert.getCake3();

    }
}
