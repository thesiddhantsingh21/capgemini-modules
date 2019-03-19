package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDataThread extends Thread {
	FileInputStream fi=null;
	FileOutputStream fo=null;
	
	public CopyDataThread(FileInputStream fi, FileOutputStream fo) {
		super();
		this.fi = fi;
		this.fo = fo;
	}
	@Override
	public void run() {
		int a=0;
		int c=0;
		try {
			while((a=fi.read())!=-1) {
				char cur=(char)a;
				fos.write((byte)cur);
				fos.flush();
				count++;
				if(c==10) {
					System.out.println("10 characters are copied");
					c=0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	

