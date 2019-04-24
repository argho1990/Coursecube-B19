class Hello14 {

    void show() throws CloneNotSupportException {

        try {

            this.clone();
        } catch (CloneNotSupportException e) {
            throw e;
        }
    }
}