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

import net.sf.memoranda.ui.ProjectsPanel;

public class ProjectPanelTest {
	
	@Test
	public void workPanelButonTest() {
		Assert.assertTrue("toggleButton is not enabled", ProjectsPanel.toggleButton.isEnabled());
		Assert.assertTrue("topBar is not enabled", ProjectsPanel.topBar.isEnabled());
		Assert.assertTrue("toolbarPanel is not enabled", ProjectsPanel.toolbarPanel.isEnabled());
		Assert.assertTrue("buttonsPanel is not enabled", ProjectsPanel.buttonsPanel.isEnabled());
		
		
	}

}