public class PullReverseCordCommand implements ICommand{
    @Override
    public void execute(Model model) {
        model.setIsForward(!model.getIsForward());
    }
}