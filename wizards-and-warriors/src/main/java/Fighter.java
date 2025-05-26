class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

}

class Wizard extends Fighter {
    private boolean isVulnerable = true;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.isVulnerable = false;
    }

    public boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.isVulnerable() ? 3 : 12;
    }

}
