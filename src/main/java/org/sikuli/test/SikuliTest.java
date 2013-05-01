package org.sikuli.test;
import java.io.File;
import java.net.MalformedURLException;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class SikuliTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ScreenRegion screenRegion = new DesktopScreenRegion();
		Target target = new ImageTarget(new File("C:/SikuliTest/JSystemIcon.png"));
		ScreenRegion region = screenRegion.find(target);
		Mouse mouse = new DesktopMouse();
		mouse.doubleClick(region.getCenter());
		Thread.sleep(8000);
		target = new ImageTarget(new File("C:/SikuliTest/TaskAddTestIcon.png"));
		region = screenRegion.find(target);
		mouse.click(region.getCenter());
		target = new ImageTarget(new File("C:/SikuliTest/AddTestToScenariosIcon.png"));
		region = screenRegion.find(target);
		mouse.click(region.getCenter());
		Thread.sleep(1000);
		target = new ImageTarget(new File("C:/SikuliTest/TestIcon.png"));
		region = screenRegion.find(target);
		mouse.doubleClick(region.getCenter());
		target = new ImageTarget(new File("C:/SikuliTest/ValueIcon.png"));
		region = screenRegion.find(target);
		mouse.click(region.getCenter());
		target = new ImageTarget(new File("C:/SikuliTest/PickValuesIcon.png"));
		region = screenRegion.find(target);
		mouse.click(region.getCenter());
		target = new ImageTarget(new File("C:/SikuliTest/PickValuesIcon.png"));
		region = screenRegion.find(target);
		mouse.click(region.getCenter());
//		target = new ImageTarget(new File("C:/SikuliTest/RunTheTestIcon.png"));
//		region = screenRegion.find(target);
//		mouse = new DesktopMouse();
//		mouse.click(region.getCenter());
		
		
//		Key key = new Key();
//		Keyboard keyboard = new DesktopKeyboard(); 
	}
}