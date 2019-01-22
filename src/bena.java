public class bena {

    private  String id;

    private  Boolean flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "bena{" +
                "id='" + id + '\'' +
                ", flag=" + flag +
                '}';
    }
}
