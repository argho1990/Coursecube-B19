class Hello15 {

    void show() throws Exception {

        try {

            this.clone();

        } catch (CloneNotSupportedException e) {

            throw e;
        }
    }

}
