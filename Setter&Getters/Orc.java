class Orc {
    private int height;

    /*
     * [this] can be used in the setter & getter (methods) but specically for getter
     * method it can be used additionally.
     * 
     * 
     */
    public void setHeight(int height) {
        if (height < 10) {
            this.height = height;
            System.out.println(" Orcs met criteria ");
            System.out.println(" Main Map :" + " (Orcs modified with height) " + " : " + this.height + " inches ");
        } else {
            System.out.println(" Please enter a height under 10 feet ");
            System.out.println(" Expanision Map :" + " (Modified Orcs) " + " : " + "None");
        }
    }

    public int getHeight() {
        return height;
    }
}