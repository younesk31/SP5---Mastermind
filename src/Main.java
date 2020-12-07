import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import gameController.PinController;
import logicController.CheckPlayerPin;
import logicController.Models.MasterMindCode;
import logicController.Models.RoundHandler;


public class Main {

    public static void main(String[] args) {


        RoundHandler rh = new RoundHandler();

        rh.newGame(4,10);

        PinController pc = new PinController();


        //System.out.println(rh.getRounds().get(0).getPlayerInputArray().get(0).getColorId());
        //System.out.println(rh.getRounds().get(0).getPlayerInputArray().get(0).getColorId());
        //System.out.println(rh.getRounds().get(0).getFeedbackArray().get(0).getColorId());
        //System.out.println(rh.getRounds().get(0).getFeedbackArray().get(0).getColorId());


        pc.changePlayerPin(rh.getRounds().get(0),0,1);
        pc.changePlayerPin(rh.getRounds().get(0),1,3);
        pc.changePlayerPin(rh.getRounds().get(0),2,5);
        pc.changePlayerPin(rh.getRounds().get(0),3,9);

        System.out.println("Player Input");
        System.out.print(rh.getRounds().get(0).getPlayerInputArray().get(0).getColorId());
        System.out.print(rh.getRounds().get(0).getPlayerInputArray().get(1).getColorId());
        System.out.print(rh.getRounds().get(0).getPlayerInputArray().get(2).getColorId());
        System.out.println(rh.getRounds().get(0).getPlayerInputArray().get(3).getColorId());


        //MasterCode
        MasterMindCode mm = new MasterMindCode(4, false);


        mm.getArrMasterCode().get(0).setColorId(1);
        mm.getArrMasterCode().get(1).setColorId(3);
        mm.getArrMasterCode().get(2).setColorId(5);
        mm.getArrMasterCode().get(3).setColorId(6);


        System.out.println("Master Code");
        System.out.print(mm.getArrMasterCode().get(0).getColorId()+" ");
        System.out.print(" "+mm.getArrMasterCode().get(1).getColorId()+" ");
        System.out.print(" "+mm.getArrMasterCode().get(2).getColorId()+" ");
        System.out.println(" "+mm.getArrMasterCode().get(3).getColorId()+" ");





        CheckPlayerPin cpp = new CheckPlayerPin();

        cpp.checkPlayerPinColor(rh.getRounds().get(0),mm);

        System.out.println("FeedBack pins");

        System.out.print(rh.getRounds().get(0).getFeedbackArray().get(0).getColorId());
        System.out.print(rh.getRounds().get(0).getFeedbackArray().get(1).getColorId());
        System.out.print(rh.getRounds().get(0).getFeedbackArray().get(2).getColorId());
        System.out.println(rh.getRounds().get(0).getFeedbackArray().get(3).getColorId());



    }
}
