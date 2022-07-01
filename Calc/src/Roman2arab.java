public enum Roman2arab {

    I(1), V(5), X(10), L(50), C(100);
    private final int value;
    private Roman2arab(int value) {
        this.value = value;
    }
    public int toInt() {
        return value;
    }
    }


