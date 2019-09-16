class Chicken implements Washable, Edible {
    private int weight;

    @Override
    public void wash() {
        // wash my two legs
        // wash my head
        // wash my body
        // wash my tail
    }
    @Override
    public int giveEnergy() {
        return (int)(4 * weight);
    }
}
