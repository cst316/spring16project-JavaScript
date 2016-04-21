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

import net.sf.memoranda.ui.TaskPanel;

public class TaskPanelTest {
	
	@Test
	public void TaskPanelTest() {
		Assert.assertTrue("historyBackB is not enabled", TaskPanel.historyBackB.isEnabled());
		Assert.assertTrue("historyForwardB is not enabled", TaskPanel.historyForwardB.isEnabled());
		Assert.assertTrue("newTaskB is not enabled", TaskPanel.newTaskB.isEnabled());
		Assert.assertTrue("subTaskB is not enabled", TaskPanel.subTaskB.isEnabled());
		Assert.assertTrue("editTaskB  is not enabled", TaskPanel.editTaskB.isEnabled());
		Assert.assertTrue("removeTaskB is not enabled", TaskPanel.removeTaskB.isEnabled());
		Assert.assertTrue("completeTaskB is not enabled", TaskPanel.completeTaskB.isEnabled());
		
	}

}
