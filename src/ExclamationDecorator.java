public class ExclamationDecorator implements MessageDecorator {
    private final Message message;

    public ExclamationDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent() + "!";
    }
}
