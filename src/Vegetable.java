class Vegetable implements Washable, Edible {
    private int weight;

    @Override
    public void wash() {
        // wash my leaves
    }
    @Override
    public int giveEnergy() {
        return (int)(0.5 * weight);
    }
}
