public class UppercaseDecorator implements MessageDecorator {
    private final Message message;

    public UppercaseDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent().toUpperCase();
    }
}
