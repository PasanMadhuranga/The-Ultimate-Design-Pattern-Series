package proxy.exercise;

public class ProxyProduct extends Product{
    private DbContext context;

    public ProxyProduct(int id, DbContext context) {
        super(id);
        this.context = context;
    }

    @Override
    public void setName(String name){
        super.setName(name);
        context.markAsChanged(this);
    }
}
