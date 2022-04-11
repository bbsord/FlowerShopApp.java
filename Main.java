import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
* Clasa main implementeaza o aplicație
* pentru afisarea ferestrei login.
 */
public class Main {
    public static void main(String[] args){
        IDCls idpr = new IDCls();

        PagLogin logP = new PagLogin(idpr.getLogInfo());
    }
}