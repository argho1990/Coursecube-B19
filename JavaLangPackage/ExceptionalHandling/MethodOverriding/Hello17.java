class Hello17 {

    void show() throws CloneNotSupportedException {

        try {

            this.clone();

        } catch (Exception e) {

            throw e;
        }
    }

}
