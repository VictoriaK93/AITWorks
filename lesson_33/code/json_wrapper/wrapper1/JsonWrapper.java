package json_wrapper.wrapper1;

public class JsonWrapper {
    // { value : value } - это формат json
  // field
  private Object value;

    public Object getValue() {
        return value;
    }

    public JsonWrapper(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{value:" + value + "}";
    }
}
