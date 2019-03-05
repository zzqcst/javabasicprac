public enum EnumTest {
    MALE(1, "男"),
    FEMALE(0, "女");
    private int id;
    private String name;

    EnumTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EnumTest getSexById(int id) {
        for (EnumTest value : EnumTest.values()) {
            if (value.getId() == id) {
                return value;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
