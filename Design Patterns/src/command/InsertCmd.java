package command;

public class InsertCmd implements Command {

    private StringBuilder sb;
    private String istStr;
    private boolean changed = false;

    public InsertCmd(StringBuilder str, String istStr){
        this.sb = str;
        this.istStr = istStr;
    }

    @Override
    public void doit() {
        sb.append(istStr);
        changed = true;
    }

    @Override
    public void undo() {
        if(changed) {
            sb.delete(sb.length() - this.istStr.length(), sb.length());
        }
    }
}
