import java.util.HashMap;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.xp = xp;
        this.maxHP = maxHP;
        this.items = items;
        this.hp = this.maxHP;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public HashMap<String, Integer> getItems() {
        return this.items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getXp() {
        return this.xp;
    }

    public Integer getMaxHP() {
        return this.maxHP;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Monster monster = (Monster)o;
            if (this.getHp() != null) {
                if (!this.getHp().equals(monster.getHp())) {
                    return false;
                }
            } else if (monster.getHp() != null) {
                return false;
            }

            label46: {
                if (this.getXp() != null) {
                    if (this.getXp().equals(monster.getXp())) {
                        break label46;
                    }
                } else if (monster.getXp() == null) {
                    break label46;
                }

                return false;
            }

            if (this.getMaxHP() != null) {
                if (this.getMaxHP().equals(monster.getMaxHP())) {
                    return this.getItems() != null ? this.getItems().equals(monster.getItems()) : monster.getItems() == null;
                }
            } else if (monster.getMaxHP() == null) {
                return this.getItems() != null ? this.getItems().equals(monster.getItems()) : monster.getItems() == null;
            }

            return false;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.getHp() != null ? this.getHp().hashCode() : 0;
        result = 31 * result + (this.getXp() != null ? this.getXp().hashCode() : 0);
        result = 31 * result + (this.getMaxHP() != null ? this.getMaxHP().hashCode() : 0);
        result = 31 * result + (this.getItems() != null ? this.getItems().hashCode() : 0);
        return result;
    }

    public String toString() {
        return "hp=" + this.hp + "/" + this.maxHP;
    }
}
