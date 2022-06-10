package SantaClausFactory;


public class MagicWordsBySantaClaus {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sayMagicWords() {
        if(this.command == null) {
            System.out.println("No magic word said");
            return;
        }
        this.command.execute();
    }
}