package ex02;

/**
 * @author Skorik Artem
 */
public class ViewableResult implements Viewable {

    @Override
    public View getView() {
        return new ViewResult();
    }
}