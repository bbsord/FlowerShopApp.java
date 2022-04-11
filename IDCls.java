import java.util.HashMap;

public class IDCls {
    HashMap<String,String> logInfo = new HashMap<String,String>();
    IDCls(){
        logInfo.put("hjgd", "hgafdv");
        logInfo.put("Username ", "Parola ");
        logInfo.put("Bianca", "b1234");
    }
    protected HashMap getLogInfo(){
        return logInfo;
    }
}
