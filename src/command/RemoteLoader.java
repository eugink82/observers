package command;

public class RemoteLoader {
    public static void main(String[] args) {
        String place="Living room";
//        RemoteControl remoteControl=new RemoteControl();
//        Light lightRoom=new Light("Light Room");
//        Light kitchenRoom=new Light("Light Kitchen");
//        Stereo stereo=new Stereo();
//        LightOnCommand lightOnCommandKitchen=new LightOnCommand(kitchenRoom);
//        LightOffCommand lightOffCommandKitchen=new LightOffCommand(kitchenRoom);
//        LightOnCommand lightOnCommandRoom=new LightOnCommand(lightRoom);
//        LightOffCommand lightOffCommandRoom=new LightOffCommand(lightRoom);
//        StereoOnWithCDCommand stereoOnCommand=new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0,lightOnCommandKitchen,lightOffCommandKitchen);
//        remoteControl.setCommand(1,lightOnCommandRoom,lightOffCommandRoom);
//        remoteControl.setCommand(2,stereoOnCommand,stereoOffCommand);
//
//        remoteControl.onButtonPush(2);
//        remoteControl.onButtonPush(1);
//        remoteControl.onButtonPush(0);
//        remoteControl.undoButtonPush();
//        System.out.println("--------------------------------");
//        RemoteControl remoteControl2=new RemoteControl();
//        CeilingFan ceilingFan=new CeilingFan("Living room");
//        CeilingFanLowCommand ceilingFanLow=new CeilingFanLowCommand(ceilingFan);
//        CeilingFanMediumCommand ceilingFanMedium=new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh=new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff=new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl2.setCommand(0,ceilingFanLow,ceilingFanOff);
//        remoteControl2.setCommand(1,ceilingFanMedium,ceilingFanOff);
//        remoteControl2.setCommand(2,ceilingFanHigh,ceilingFanOff);
//
//        remoteControl2.onButtonPush(0);
//        remoteControl2.offButtonPush(0);
//        System.out.println(remoteControl2);
//        remoteControl2.undoButtonPush();
//        System.out.println(remoteControl2)

        Light light=new Light(place);
        TV tv=new TV(place);
        Stereo stereo=new Stereo(place);
        Hottub hottub=new Hottub();

        LightOnCommand lightOn=new LightOnCommand(light);
        TvOnCommand tvOn=new TvOnCommand(tv);
        StereoOnWithCDCommand stereoOnWithCD=new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOn=new HottubOnCommand(hottub);
        Command[] commands=new Command[]{lightOn, tvOn, stereoOnWithCD, hottubOn};
        MacroCommand macroCommand=new MacroCommand(commands);
        macroCommand.execute();
    }
}
