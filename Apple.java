class Apple extends Fruit {

    public Apple (){
        setWeight(1.0);
    }


    @Override
    public String toString() {
        return super.toString() + ": i am apple";
    }
}