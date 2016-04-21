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

import net.sf.memoranda.ui.EventsPanel;

public class EventsPanelTest {
	
	@Test
	public void eventsPanelButonTest() {
		Assert.assertTrue("historyBackB is not enabled", EventsPanel.historyBackB.isEnabled());
		Assert.assertTrue("historyForwardB is not enabled", EventsPanel.historyForwardB.isEnabled());
		Assert.assertTrue("newEventB is not enabled", EventsPanel.newEventB.isEnabled());
		Assert.assertTrue("editEventB is not enabled", EventsPanel.editEventB.isEnabled());
		Assert.assertTrue("removeEventB is not enabled", EventsPanel.removeEventB.isEnabled());
		
	}

}
