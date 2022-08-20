public class PullSpeedCordCommand implements ICommand {
    @Override
    public void execute(Model model) {
        if(model.getSpeed() == 3){
            model.setSpeed(0);;
        }else{
            model.setSpeed(model.getSpeed() + 1);
        }
    }
}
