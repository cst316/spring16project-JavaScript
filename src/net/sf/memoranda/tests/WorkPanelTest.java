package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.sf.memoranda.ui.WorkPanel;

public class WorkPanelTest {
	
	@Test
	public void workPanelButonTest() {
		Assert.assertTrue("agendaB is not enabled", WorkPanel.agendaB.isEnabled());
		Assert.assertTrue("tasksB is not enabled", WorkPanel.tasksB.isEnabled());
		Assert.assertTrue("eventsB is not enabled", WorkPanel.eventsB.isEnabled());
		Assert.assertTrue("filesB is not enabled", WorkPanel.filesB.isEnabled());
		Assert.assertTrue("pspB is not enabled", WorkPanel.pspB.isEnabled());
		Assert.assertTrue("pspBLearn is not enabled", WorkPanel.pspBLearn.isEnabled());
		
	}

}