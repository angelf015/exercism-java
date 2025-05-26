class Badge {
    public String print(Integer id, String name, String department) {
        String first = id == null ? "" : "[" + id + "] - ";
        String second = department == null ? "OWNER" : department.toUpperCase();
        return first + name + " - " + second;
    }
}
