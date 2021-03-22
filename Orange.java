class Orange extends Fruit {

    public Orange(){
        setWeight(1.5);
    }


    @Override
    public String toString() {
        return super.toString() + ": i am orange";
    }

}